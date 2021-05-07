package com.company;

public class Employee {
    private String job;

    public Employee(String jb) {
        job = jb;
    }

    public void setJob(String jb){
        job = jb;
    }

    public String getJob(){
        return job;
    }

    public String toString() {
        return "Employee{job='" + job + '}';
    }
}
