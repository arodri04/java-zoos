package com.zoo.zoo.Controllers;

import com.zoo.zoo.Model.Zoo;
import com.zoo.zoo.Service.AnimalService;
import com.zoo.zoo.Service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/zoo")
public class ZooController
{
    @Autowired
    private ZooService zooService;

    @Autowired
    private AnimalService animalService;

    @GetMapping(value="/zoos", produces = {"application/json"})
    public ResponseEntity<?> listAllZoos()
    {
        return new ResponseEntity<>(zooService.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "/animals", produces = {"application/json"})
    public ResponseEntity<?> listAllAnimals()
    {
        return new ResponseEntity<>(animalService.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "/animals/{name}", produces = {"application/json"})
    public ResponseEntity<?> getAnimalname(@PathVariable String name)
    {
        return new ResponseEntity<>(animalService.findName(name), HttpStatus.OK);
    }


    @GetMapping(value = "/zoo/{name}", produces = {"application/json"})
    public ResponseEntity<?> getZooname(@PathVariable String name)
    {

        return new ResponseEntity<>(zooService.findName(name), HttpStatus.OK);
    }
//    @GetMapping(value = "/animals/count", produces = {"application/json"})
//    public ResponseEntity<?> getCountAnimalsInZoos()
//    {
//        return ResponseEntity<>(animalService.getCountAnimalsInZoo(), HttpStatus.OK);
//    }

    @PutMapping(value = "/admin/zoos/{id}", consumes = {"application/jon"}, produces = {"application/json"})
    public ResponseEntity<?> putZoo(@PathVariable long id, @Valid @RequestBody Zoo zoo)
    {
        zooService.update(zoo, id);
        return new ResponseEntity<>(zooService.findById(id), HttpStatus.OK);
    }
}
