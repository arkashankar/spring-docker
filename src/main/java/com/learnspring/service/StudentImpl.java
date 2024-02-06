package com.learnspring.service;

import com.learnspring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentImpl {

    @Autowired
    private Student student;


    static List<Student> al = new ArrayList<>();

    public List<Student> getAllStudent(){
        al.add(new Student(1, "Aman", "pune", "MIT"));
        al.add(new Student(2, "Ram", "mumbai", "IIT"));
        al.add(new Student(3, "Lakshman", "Ranchi", "BIT"));

        return al;
    }

}
