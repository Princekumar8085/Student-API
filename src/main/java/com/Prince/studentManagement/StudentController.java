package com.Prince.studentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

public class StudentController {
    Map<Integer,Student> db = new HashMap<>();

    //get imformation..
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("p") int admnNo){
        return db.get(admnNo);
    }
    //adding imformation..
    @PostMapping("/added_student")
    public String addStudent(@RequestBody Student student){
        int admnNo = student.getAdmnNo();
        db.put(admnNo,student);
        return "Student added successfully";
    }


}
