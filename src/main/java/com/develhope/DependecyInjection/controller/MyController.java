package com.develhope.DependecyInjection.controller;

import com.develhope.DependecyInjection.service.MyService;
import jakarta.websocket.OnMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {


    @RequestMapping("/")
    String message(){
        return "welcome";
    }
    MyController(){
        System.out.println("MyController constructor has been called");
    }
    @Autowired
    private MyService service;

    @GetMapping("getName")
    public String getName(){

        System.out.println("MyService.getName() has been called");
        return service.getName();
    }

}
