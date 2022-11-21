package org.example.bd;

import org.example.Staff;

import java.util.LinkedList;
import java.util.List;

public class DataBase {
    List<Staff> employeeList = new LinkedList<>();

    public void addEmployee(Staff employee){
        employeeList.add(employee);
    }
}
