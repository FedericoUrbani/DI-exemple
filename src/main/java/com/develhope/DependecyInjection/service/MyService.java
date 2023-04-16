package com.develhope.DependecyInjection.service;

import com.develhope.DependecyInjection.utils.MyComponent;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyService {
    @Autowired
    private MyComponent myComponent;

    MyService(){
        System.out.println("MyService constructor has been called");
    }
   public String getName(){
       return myComponent.getMyComponentName();
   }
}
