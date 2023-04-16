package com.develhope.DependecyInjection.utils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component


public class MyComponent {
    @Value("Federico")
    String myComponentName;
    MyComponent(){
        System.out.println("MyComponent constructor has been called");;
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName() has been called");
        String myComponentImmutableName=myComponentName;
        return myComponentImmutableName;
    }
}
