package com.test.rest.webservices.restwebservicesdemo.filtering;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dharma on 6/5/20.
 */
@RestController
public class FilteringController {


    @GetMapping("/filtering")
    public TestBean  retreiveTestBean() {
     return new TestBean("Value" , "Value2" , "value3");
    }

}
