package com.example.demo.controller;

import com.example.demo.pojo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Person hello(){
        Person person = new Person();
        person.setName("huangweike");
        person.setAge("33");
        return person;
    }
}
