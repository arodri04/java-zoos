package com.zoo.zoo.Service;

import com.zoo.zoo.Model.Zoo;
import com.zoo.zoo.Repository.ZooRepository;
import com.zoo.zoo.view.CountAnimalsInZoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Service(value = "zooService")
public class ZooServiceImpl implements ZooService
{
    @Autowired
    private ZooRepository zoorepos;

    @Override
    public ArrayList<Zoo> findAll() {
        ArrayList<Zoo> list = new ArrayList<>();
        zoorepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Zoo findName(String zooname)
    {
        return zoorepos.findZooByZooname(zooname);
    }
    @Override
    public Zoo findById(long id)
    {
        return zoorepos.findById(id).get();
    }

    @Override
    @Transactional
    public Zoo update(Zoo zoo, long id) {
        Zoo cz = zoorepos.findById(id)
                .orElseThrow(()-> new EntityNotFoundException(Long.toString(id)));

        if (zoo.getZooname() != null)
        {
            cz.setZooname(zoo.getZooname());
        }

        return zoorepos.save(cz);
    }
}
