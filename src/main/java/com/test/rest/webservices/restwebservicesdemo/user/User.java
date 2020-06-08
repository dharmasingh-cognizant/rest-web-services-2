package com.test.rest.webservices.restwebservicesdemo.user;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by dharma on 6/3/20.
 */
public class User {


    private Integer id;

    @Size(min=2 , message = "name should have atleast > 2 chars")
    private String name;
    private Date birthdate;


    protected User(){

    }

    public User(Integer id, String name, Date birthdate) {
        super();
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

}
