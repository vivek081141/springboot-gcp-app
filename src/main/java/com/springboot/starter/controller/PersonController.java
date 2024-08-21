package com.springboot.starter.controller;

import com.springboot.starter.bean.Person;
import com.springboot.starter.exception.BadInputException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/person")
public class PersonController {


    private BeanPropertyBindingResult error;

    Map<String, Person> personMap = new HashMap<>();

    @GetMapping(path = "/getPerson/{id}" )
    public ResponseEntity<Person> getPerson(@PathVariable @NotNull String id)  {

        Person personEntity = personMap.get(id);
        return ResponseEntity.ok().body(personEntity);
    }



    @GetMapping(path = "/getPersons" )
    public ResponseEntity<List<Person>> getPersons()  {
        List<Person> personEntity = new ArrayList<>(personMap.values());
        return ResponseEntity.ok().body(personEntity);
    }


    @PostMapping(path = "/createPerson" )
    public ResponseEntity<Person> createPerson(@Valid @RequestBody Person person, BindingResult bindingResult)  {
        personMap.put(person.getPersonId(), person);
        if (bindingResult.hasErrors()){
            throw new BadInputException(bindingResult);
        }
        return ResponseEntity.ok().body(person);
    }

}
