package com.ps.rest.crud.helloworld.controller;

import com.ps.rest.crud.helloworld.service.PersonCRUDImplementation;
import com.ps.rest.crud.helloworld.model.Person;
import com.ps.rest.crud.helloworld.service.PersonCRUDRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class PersonCrudController {
    @Autowired
    PersonCRUDRepo personCRUDRepo;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "spring-rest-crud-helloworld Deployment is OK";
    }

    @RequestMapping(value = "add/{name}", method = RequestMethod.POST)
    public ResponseEntity<?> insert(@PathVariable("name") String name) {
        boolean isSuccessToInsert = personCRUDRepo.insert(name);

        if (isSuccessToInsert){
            return new  ResponseEntity<>("Successfully inserted.", HttpStatus.CREATED);
        }

        return new ResponseEntity<>("Fail to insert.", HttpStatus.FAILED_DEPENDENCY);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update() {
        return "spring-rest-crud-helloworld Deployment is OK";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String delete() {
        return "spring-rest-crud-helloworld Deployment is OK";
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<?> select() {
        List<Person> personList = personCRUDRepo.selectAll();
        if (personList.isEmpty()) {
            return new ResponseEntity<>("Not available person", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(personList, HttpStatus.OK);
    }
}
