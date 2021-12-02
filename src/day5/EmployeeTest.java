package day5;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {

        //object can't be created when private
        // Employee employee = new Employee(); //default constructor


        Employee employee = new Employee("Sireej", "Pradhan", 25, 3500, null); // parameterized constructor
        Employee employeeB = new Employee("Aditya", null, "Piya", 25, 35000, LocalDate.now());
        Employee employeeC = new Employee("Anjil", null, 25, 25000, LocalDate.now());
        Employee employeeD = new Employee("Binod", "Lopchan", 25, 25000, LocalDate.now());

        employee.raiseSalary(20);
        employeeB.raiseSalary(20);


        employee.displayEmployeeDetail();
        employeeB.displayEmployeeDetail();
        employeeC.displayEmployeeDetail();
        employeeD.displayEmployeeDetail();

        //  raiseSalary(employee,10);
    }


    //
    //public static void raiseSalary(Employee employee, double percentage) {
    //}

}
