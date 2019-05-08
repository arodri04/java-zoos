package com.zoo.zoo.Service;

import com.zoo.zoo.Model.Zoo;
import com.zoo.zoo.Repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

//    @Override
//    public ArrayList<> getCountAnimalsInZoo() {
//        return zoorepos.getCountAnimalsInZoo();
//    }
}
