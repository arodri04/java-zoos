package com.zoo.zoo.Service;


import com.zoo.zoo.Model.Animal;
import com.zoo.zoo.Model.Zoo;

import java.util.ArrayList;

public interface AnimalService
{
    ArrayList<Animal> findAll();
    Animal findName(String name);
//    ArrayList<Animal> getCountAnimalsInZoo();
}
