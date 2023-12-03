package com.project.sample.java.controller;

import com.project.sample.java.Entity.User1;
import com.project.sample.java.Repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    repo r;

    @GetMapping(value = "/show/data/{name}/city")
    public String showdata(@PathVariable ("name") String data1, @RequestParam String data2) {
        User1 u1 = new User1();
        u1.setName("Naresh");
        u1.setAge("24");
        u1.setGender("Male");

        r.save(u1);

        return "Welcome" + " " + data1 + " TO " + data2;
    }
}
