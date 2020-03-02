package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {

    private static Logger LOGGER = LoggerFactory.getLogger(UsersController.class);

    public UsersController(){
        //For Spring
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody String user) {
        LOGGER.info("Se va a proceder a crear el usuario {}", user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<String> getUsers() {
        return Arrays.asList("Fernando", "Analia");
    }
}