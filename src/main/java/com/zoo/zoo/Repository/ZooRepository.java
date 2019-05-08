package com.zoo.zoo.Repository;
import com.zoo.zoo.Model.Zoo;
//import com.zoo.zoo.view.CountAnimalsInZoo;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


public interface ZooRepository extends CrudRepository<Zoo, Long>
{
    @Query(value = "SELECT z.animalid, animalname, count(animalid) as countanimal FROM zooanimals z INNER JOIN animal a on z.zooid=z.zooid GROUP BY z.animalid, animalname");
    ArrayList<CountAnimalsInZoo> getCountAnimalsInZoo();
}

