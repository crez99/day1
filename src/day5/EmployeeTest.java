package day5;

import java.time.LocalDate;  // used to get the current local date

/**
 * this class is used to run the main method and display the data of the employee that is stored.
 */


public class EmployeeTest {

    public static void main(String[] args) {

        //object can't be created when private
        // Employee employee = new Employee(); //default constructor


        //data for the different employees of the company
        Employee employee = new Employee("Sireej", "Pradhan", "445668558", "4434", 25, 3500, null); // parameterized constructor
        Employee employeeB = new Employee("Aditya", "Bhasu", "Piya", "225225225", "4254", 25, 35000, LocalDate.now());
        Employee employeeC = new Employee("Anjil", "Adhikari", "445445445", "2254", 28, 25000, LocalDate.now());
        Employee employeeD = new Employee("Sakshi", "Lamichhane", "255255255", "5524", 40, 250000, LocalDate.now());


        employee.raiseSalary(20);  //raise salary of employee by 20%
        employeeB.raiseSalary(20);  //raise salary of employeeB by 20%

        //different employee details are displayed once the program is run
        employee.displayEmployeeDetail();
        employeeB.displayEmployeeDetail();
        employeeC.displayEmployeeDetail();
        employeeD.displayEmployeeDetail();


        //display the number of employess by counting thats stored

        System.out.println(Employee.getCount());
        System.out.println(Employee.getCount());
        System.out.println(Employee.getCount());
        System.out.println(Employee.getCount());


        //  raiseSalary(employee,10);
    }


    //
    //public static void raiseSalary(Employee employee, double percentage) {
    //}

}
