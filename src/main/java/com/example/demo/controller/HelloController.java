package com.example.demo.controller;

import com.example.demo.pojo.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Person hello(){
        logger.info("I'm here !");
        Person person = new Person();
        person.setName("huangweike");
        person.setAge("33");
        return person;
    }
}
