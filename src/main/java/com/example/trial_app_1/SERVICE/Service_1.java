package com.example.trial_app_1.SERVICE;

import com.example.trial_app_1.DAO_1.dao;
import com.example.trial_app_1.DAO_1.dao1;
import com.example.trial_app_1.MODEL.SchoolStudent;
import com.example.trial_app_1.MODEL.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Service_1 {
    @Autowired
    dao dao;

    @Autowired
    dao1 dao1;
    public ArrayList<Student> findAll(){
        return (ArrayList<Student>) dao.findAll();
    }
    public ArrayList<SchoolStudent> findAll1(){
        return (ArrayList<SchoolStudent>) dao1.findAll();
    }

    public ArrayList<Student> myData(){
        return dao.getData();
    }


    public ArrayList<SchoolStudent> get(){
        return dao1.getDataItem();
    }
}
