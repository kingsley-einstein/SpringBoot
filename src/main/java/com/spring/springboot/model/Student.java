package com.spring.springboot.model;

public class Student {
    String matric;
    String firstName;
    String lastName;
    Integer age;
    
    public void setMatric(String matric) {
        this.matric = matric;
    }
    
    public String getMatric() {
        return matric;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Integer getAge() {
        return age;
    }
}