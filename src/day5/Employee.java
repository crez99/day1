package day5;

import java.time.LocalDate;

public class Employee {

    private String firstName; // mandatory
    private String middleName;
    private String lastName;    //mandatory
    private int age;
    private double salary;
    private LocalDate hireDate;


    //set as private so the users can't edit the fields
    private Employee() {
    }  //it is a default constructor. no value needed to be passed


    //Parameterized Constructor
    public Employee(String firstName, String lastName, int age, double salary, LocalDate hireDate) {
        //purple color on the name defines the value is for String name, Employee class
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
    }

            public Employee(String firstName, String middleName, String lastName, int age, double salary, LocalDate hireDate) {
                //purple color on the name defines the value is for String name, Employee class
                this.firstName = firstName;
                this.middleName=middleName;
                this.lastName = lastName;
                this.age = age;
                this.salary = salary;
                this.hireDate = hireDate;

            }

            public void raiseSalary(Employee employee,double percentage){
                employee.salary+=(employee.salary*percentage)/100;
            }





    public void displayEmployeeDetail(Employee employee) {
        System.out.println(employee.firstName);
        System.out.println(employee.middleName);
        System.out.println(employee.lastName);
        System.out.println(employee.age);
        System.out.println(employee.salary);
        System.out.println(employee.hireDate);
    }


}
