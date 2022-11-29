package org.example.model;

import org.example.Employee;
import org.example.Positions;
import org.example.Staff;

import java.util.concurrent.atomic.AtomicReference;

public class ListOfEmployees {

  public static void printEmployee(){

   Staff staff = Staff.getStaff();

   for (Employee e : staff){
    System.out.println(
            String.format("Employee name: %s, familia: %s, year: %d, id: %d, post: %s"
                    , e.getName(), e.getSecondName(), e.getYearStarted(), e.getId(), e.getPost()));
   }
  }

    public static void main(String[] args) {

     Staff staff = Staff.getStaff();

     Employee Manager = new Employee("Helena", "Belova", Positions.MANAGER, 001, 2018);

     Employee Director = new Employee("Svetlana", "",
             Positions.DIRECTOR, 002, 2017);
     Employee SENIOR_SALESMAN_1 = new Employee("Tatyana ",
             "Crasheninnicova", Positions.SENIOR_SALESMAN,
             003, 2019);
     Employee SENIOR_SALESMAN_2 = new Employee("Evgeniya ",
             "Orlova", Positions.SENIOR_SALESMAN, 004,
             2021);
     Employee SALESMAN_1_1 = new Employee("Anastasia", "Pershicova", Positions.SALESMAN, 005, 2021);
     Employee SALESMAN_1_2 = new Employee("Vera", "Popova", Positions.SALESMAN, 006, 2021);
     Employee SALESMAN_2_1 = new Employee("Irina", "Oboturova", Positions.SALESMAN, 7, 2020);
     ;
     Employee SALESMAN_2_2 = new Employee("Anastasia", "Hohlova", Positions.SALESMAN, 8, 2020);
     Employee Bacer_1 = new Employee("Olga", "Lucicheva", Positions.BACER, 9, 2020);

     staff.addEmployee(Director);
     staff.addEmployee(Manager);
     staff.addEmployee(SENIOR_SALESMAN_1);
     staff.addEmployee(SALESMAN_1_2);
     staff.addEmployee(SALESMAN_1_1);
     staff.addEmployee(SALESMAN_2_1);
     staff.addEmployee(SALESMAN_2_2);
     staff.addEmployee(Bacer_1);
//        staff.addEmployee(Bacer_2);

    printEmployee();

//     boolean res = staff.removeEmployee(
//             "Olga", "Lucicheva");
//     System.out.println("employee was removed: " + res);

     staff.sortByPost();
     printEmployee();
    }
}
