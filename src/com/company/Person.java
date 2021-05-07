package com.company;

public class Person {
    private String name;
    private int age;

    public Person(String nm,int ag) {
        name = nm;
        age = ag;
    }

    public void setName(String nm){
        name = nm;
    }

    public String getName(){
        return name;
    }

    public void setAge(int ag){
        age = ag;
    }

    public int getAge(){
        return age;
    }


    public String toString() {
        return "Person{" + "name='" + name + ", age=" + age + '}';
    }



}
