package com.zoo.zoo.Service;

import com.zoo.zoo.Model.Animal;
import com.zoo.zoo.Repository.AnimalRepository;
import com.zoo.zoo.view.CountAnimalsInZoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalrepos;

    @Override
    public ArrayList<Animal> findAll() {
        ArrayList<Animal> list = new ArrayList<>();
        animalrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Animal findName(String name) {
        return animalrepos.findAnimalByAnimaltype(name);



    }

//    @Override
//    public ArrayList<CountAnimalsInZoo> getCountAnimalsInZoo() {
//        return animalrepos.getCountAnimalsInZoo();
//    }


}
