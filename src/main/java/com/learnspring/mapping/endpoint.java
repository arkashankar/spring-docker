package com.learnspring.mapping;

import com.learnspring.entity.Student;
import com.learnspring.service.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class endpoint {
    @Autowired
    private StudentImpl studentImpl;

    @Autowired
    private Student s;

    @GetMapping("/getall")
    public List<Student> getAllStudent(){
        return studentImpl.getAllStudent();

    }
}
