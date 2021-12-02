package day5;

import java.time.LocalDate;
import java.util.Objects;

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
        this.lastName = Objects.requireNonNullElse(lastName, "Unknown");
        this.age = age;
        this.salary = salary;

        //if(hireDate==null) {
        //   this.hireDate = LocalDate.now();
        //}else{
        //  this.hireDate=hireDate;
        //}

        this.hireDate = Objects.requireNonNullElse(hireDate, LocalDate.now());
    }

    public Employee(String firstName, String middleName, String lastName, int age, double salary, LocalDate hireDate) {
        //purple color on the name defines the value is for String name, Employee class
        this.firstName = firstName;
        this.middleName = Objects.requireNonNullElse(middleName, "Unknown");
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void raiseSalary( double percentage) {
        this.salary += (this.salary * percentage) / 100;
    }


    public void displayEmployeeDetail() {
        System.out.println(this.firstName);
        System.out.println(this.middleName);
        System.out.println(this.lastName);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println(this.hireDate.toString()); //changed to null.toString
    }


}
