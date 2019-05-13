package com.zoo.zoo.Service;

import com.zoo.zoo.Model.Zoo;

import java.util.ArrayList;

public interface ZooService
{
    ArrayList<Zoo> findAll();
    Zoo findName(String zooname);
    Zoo update(Zoo zoo, long id);
    Zoo findById(long id);


}
