package com.example.trial_app_1.CONTROLLER;

import com.example.trial_app_1.MODEL.SchoolStudent;
import com.example.trial_app_1.MODEL.Student;
import com.example.trial_app_1.SERVICE.Service_1;
import com.example.trial_app_1.DAO_1.dao;
import com.example.trial_app_1.DAO_1.dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/app")
public class Controller {
    @Autowired
    Service_1 s;
    @Autowired
    dao dao;

    @Autowired
    dao1 dao1;

    @GetMapping("/hellow")
    public ResponseEntity<List<Student>> op(){
        return new ResponseEntity<>(s.findAll(), HttpStatus.OK);
    }

    @GetMapping("/hellow1")
    public ResponseEntity<List<SchoolStudent>> lol(){
        return new ResponseEntity<>(s.findAll1(), HttpStatus.OK);
    }

    @GetMapping("/pupun")
    public ResponseEntity<List<Student>> myData(){
        return new ResponseEntity<List<Student>>(s.myData(), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<ArrayList<SchoolStudent>> get(){    
        return new ResponseEntity<>(s.get(), HttpStatus.OK);
    }
    @GetMapping("/grade")
    public ResponseEntity<ArrayList<SchoolStudent>> getGrade(){
        return new ResponseEntity<ArrayList<SchoolStudent>>(dao1.getGrade(), HttpStatus.OK);
    }

    @GetMapping("/lastname/{a}")
    public ResponseEntity<SchoolStudent> getByName(@PathVariable String a){
        // return new ResponseEntity<SchoolStudent>(dao1.getName(a), HttpStatus.OK);
        return new ResponseEntity<SchoolStudent>(dao1.getName(a), HttpStatus.OK);
    }
}
