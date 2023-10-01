package com.example.trial_app_1.MODEL;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class SchoolStudent {
    @Id
    private Integer student_id;
    private String first_name;
    private String last_name;
    private Integer age;
    private Character grade;
}
