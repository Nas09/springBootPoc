package com.example.demo.controller;


import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
 * Created by Nasr on 05/07/2018.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/save")
    public String save() {
        personRepository.save(new Person("Nabil","Amrouche"));
        personRepository.save(new Person("Youssef","Nait Belkacem"));
        personRepository.save(new Person("Nasr","Chadli"));
        return "done";
    }

    @GetMapping("/getAll")
    public String getAll() {
        String result="<htlm>";
        for(Person person : personRepository.findAll()){
            result += "<div>"+person.toString()+"<div>";
        }
        return result + "</html>";
    }

    @RequestMapping("/findbylastname")
    public String getPersonByLastName(@RequestParam("lastname") String lastName) {
        String result="<htlm>";
        for(Person person : personRepository.findByLastName(lastName)){
            result += "<div>"+person.toString()+"<div>";
        }
        return result + "</html>";
    }

}