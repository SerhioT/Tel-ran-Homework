package org.example;

public class Employee implements Comparable<Employee>{

    private String name;
    private String secondName;
    private Positions post;
    private int id;
    private int yearStarted; // стаж работы


    public Employee(String name, String secondaryName, Positions post,
                    int id, int yearStarted) {
        this.name = name;
        this.secondName = secondaryName;
        this.post = post;
        this.id = id;
        this.yearStarted = yearStarted;
    }



    public String getName() {return name;}
    public String getSecondName() { return secondName;}
    public Positions getPost() { return post;}
    public int getId() {return id;}
    public int getYearStarted() {return yearStarted;}

    public static void main(String[] args) {

    }


    @Override
    public int compareTo(Employee o) {
//        return yearStarted - o.yearStarted;
        int res = this.name.compareTo(o.name);
        if (res == 0){
           res = this.secondName.compareTo(o.secondName);
        }
        return res;
    }

}
