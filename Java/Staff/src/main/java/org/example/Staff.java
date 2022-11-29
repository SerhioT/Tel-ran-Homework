package org.example;

import java.util.*;


// Class Type Singletone
public class Staff implements Iterable<Employee> {

    public class PostComparator implements Comparator<Employee>{


        @Override
        public int compare(Employee o1, Employee o2) {
            return 0;
        }
    }

    public void sortByPost(){
        employees.sort(new PostComparator());
    }


    public class IdComparator implements Comparator<Employee>{
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getId() - o2.getId();
        }
    }
    public void sortById(){
       employees.sort(new IdComparator());
    }
    public class EmployeeIterator implements Iterator<Employee> {

        int count = 0;
        List<Employee> employees;

        public EmployeeIterator(List<Employee> employees) {
            this.employees = employees;
        }

        @Override
        public boolean hasNext() {
            return count <= employees.size();
        }

        @Override
        public Employee next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return employees.get(count++);
        }
    }

    static Staff msStaff = null;
    List<Employee> employees = new LinkedList<Employee>();

    public static Staff getStaff() {

        if (msStaff == null) {
            msStaff = new Staff();
        }
        return msStaff;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        Collections.sort(employees);
    }

    public boolean removeEmployee(String name,
                                  String secondaryName) {
        boolean result = false;
        Iterator<Employee> ie = employees.iterator();
        while (ie.hasNext() && result == false) {


            Employee employees = ie.next();
            if (employees.getName().equals(name) &&
                    employees.getSecondName().
                            equals(secondaryName)) {
                ie.remove();
                result = true;
            }
        }
        return result;
    }


    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator(employees);
    }
}

