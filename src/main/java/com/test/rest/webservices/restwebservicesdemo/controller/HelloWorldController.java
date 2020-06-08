package com.test.rest.webservices.restwebservicesdemo.controller;

import com.test.rest.webservices.restwebservicesdemo.helloworld.HellowWorldBean;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dharma on 6/3/20.
 */
@RestController
public class HelloWorldController {
   @GetMapping(path= "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path ="/hello-world-bean")
    public HellowWorldBean hellowWorldBean(){
        return new HellowWorldBean("Hello World");
    }

    @GetMapping(path ="/hello-world/path-variable/{var}")
    public HellowWorldBean hellowWorldPathVariable(@PathVariable String var){
        return new HellowWorldBean(String.format("Hello World , %s" , var));
    }


}
