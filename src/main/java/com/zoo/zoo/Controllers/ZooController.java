package com.zoo.zoo.Controllers;

import com.zoo.zoo.Model.Zoo;
import com.zoo.zoo.Service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/zoo")
public class ZooController
{
    @Autowired
    private ZooService zooService;

    @GetMapping(value="/zoos", produces = {"application/json"})
    public ResponseEntity<?> listAllZoos()
    {
        return new ResponseEntity<>(zooService.findAll(), HttpStatus.OK);
    }

//    @GetMapping(value = "/animals/count", produces = {"application/json"})
//    public ResponseEntity<?> getCountAnimalsInZoos()
//    {
//        return ResponseEntity<>(zooService.getCountAnimalsInZoo(), HttpStatus.OK);
//    }
}
