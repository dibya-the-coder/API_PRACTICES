package com.example.trial_app_1.DAO_1;
import com.example.trial_app_1.MODEL.Student;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface dao extends JpaRepository<Student, Integer> {

    @Query("SELECT A FROM Student A WHERE roll_no >5")
    public ArrayList<Student> getData();


    
}
