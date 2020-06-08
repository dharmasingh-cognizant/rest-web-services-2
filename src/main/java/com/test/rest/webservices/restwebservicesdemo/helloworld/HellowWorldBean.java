package com.test.rest.webservices.restwebservicesdemo.helloworld;

/**
 * Created by dharma on 6/3/20.
 */
public class HellowWorldBean {

    private  String message;

    public HellowWorldBean(String message) {
        this.message = message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "HellowWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

}
