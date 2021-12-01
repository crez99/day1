package day5;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {

        //object can't be created when private
        // Employee employee = new Employee(); //default constructor


        Employee employee = new Employee("Sireej","Pradhan",25,35000,LocalDate.now()); // parameterized constructor
        Employee employeeB = new Employee("Aditya","Bhasu", "Piya",25,35000, LocalDate.now());
        Employee employeeC=new Employee("Anjil","Adhikari",25,25000,LocalDate.now());
        Employee employeeD=new Employee("Binod","Lopchan",25,25000,LocalDate.now());

        employee.raiseSalary(employeeC,50);

        employee.displayEmployeeDetail(employee);
        employeeB.displayEmployeeDetail(employeeB);
        employeeC.displayEmployeeDetail(employeeC);
        employeeD.displayEmployeeDetail(employeeD);

    }
}
