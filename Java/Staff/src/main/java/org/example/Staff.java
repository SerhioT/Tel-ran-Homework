package org.example;

public class Staff {
    private String name;



    Positions employee;
    private int age;
    private int workExperience; // стаж работы
//    private int workingTime;    // отработанное время

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public Staff() {
        this.name = name;
        this.age = age;
        this.workExperience = workExperience;
        this.employee = employee;
//        this.workingTime = workingTime;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public static void main(String[] args) {


    }



    }
