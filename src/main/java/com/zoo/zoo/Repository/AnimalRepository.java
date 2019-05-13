package com.zoo.zoo.Repository;
import com.zoo.zoo.Model.Animal;
import com.zoo.zoo.view.CountAnimalsInZoo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    Animal findAnimalByAnimaltype(String animalname);

//    @Query(value = "select a.animaltype, count(za.animalid) as zoos from animal a left join zooanimals za on a.animalid = za.animalid group by a.animaltype")
//    ArrayList<CountAnimalsInZoo> getCountAnimalsInZoo();
}
