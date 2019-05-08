package com.zoo.zoo.Repository;
import com.zoo.zoo.Model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
}
