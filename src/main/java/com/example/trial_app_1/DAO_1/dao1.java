package com.example.trial_app_1.DAO_1;

import com.example.trial_app_1.MODEL.SchoolStudent;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface dao1 extends JpaRepository<SchoolStudent,Integer> {

    @Query("SELECT A FROM SchoolStudent A")
    public ArrayList<SchoolStudent> getDataItem();

    @Query("SELECT A FROM SchoolStudent A WHERE grade= 'A'")
    public ArrayList<SchoolStudent> getGrade();

    @Query("SELECT A FROM SchoolStudent A WHERE last_name=:a")
    public SchoolStudent getName(String a);
        
    }

