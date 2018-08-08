package com.spring.springboot.controller;

import com.spring.springboot.model.Student;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    
    public final static Map<String, Student> mapper = new HashMap<>();
    
    static {
        Student kingsley = new Student();
        kingsley.setMatric("F/ND/16/3210034");
        kingsley.setFirstName("Kingsley");
        kingsley.setLastName("Victor");
        kingsley.setAge(19);
        
        mapper.put(kingsley.getMatric(), kingsley);
        
        Student promise = new Student();
        promise.setMatric("F/ND/16/3210039");
        promise.setFirstName("Promise");
        promise.setLastName("Agbogwu");
        promise.setAge(20);
        
        mapper.put(promise.getMatric(), promise);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Object> getStudent() {
        return new ResponseEntity<>(mapper.values(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody Student student) {
        mapper.put(student.getMatric(), student);
        
        return new ResponseEntity<>("Student created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delete/{matric}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("matric") String matric) {
        mapper.remove(matric);

        return new ResponseEntity<>("Deleted Student", HttpStatus.OK);
    }
}