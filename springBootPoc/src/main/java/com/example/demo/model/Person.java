package com.example.demo.model;/**
 * Created by Nasr on 05/07/2018.
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "persons")
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName=lastName;
    }

    public  Person(){

    }

    public String toString(){
        return this.firstName+" "+this.lastName;
    }
}
