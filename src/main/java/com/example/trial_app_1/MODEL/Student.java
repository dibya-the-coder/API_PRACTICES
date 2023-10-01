package com.example.trial_app_1.MODEL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigInteger;

@Data
@Entity
public class Student {
    @Id
    private Integer roll_no;
    private String name;
    private BigInteger mob_no;
}
