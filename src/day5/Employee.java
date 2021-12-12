package day5;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String firstName; // mandatory
    private String middleName;  //optional
    private String lastName;    //mandatory
    private String socialSecurityNumber;    //
    private String pinCode;
    private int age;    //mandatory
    private double salary;  //mandatory
    private LocalDate hireDate;     //mandatory
    private static int count = 0;     //adding static helps to run same variable

    //set as private so the users can't edit the fields
    private Employee() {
    }  //it is a default constructor. no value needed to be passed


    //Parameterized Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, String pinCode, int age, double salary, LocalDate hireDate) {
        count += 1;
        //purple color on the name defines the value is for String name, Employee class
        this.firstName = firstName;
        this.lastName = Objects.requireNonNullElse(lastName, "Unknown");
        this.socialSecurityNumber = socialSecurityNumber;
        this.pinCode = pinCode;
        this.age = age;
        this.salary = salary;

        //if(hireDate==null) {
        //   this.hireDate = LocalDate.now();
        //}else{
        //  this.hireDate=hireDate;
        //}

        this.hireDate = Objects.requireNonNullElse(hireDate, LocalDate.now());
    }

    public Employee(String firstName, String middleName, String lastName, String socialSecurityNumber,String pinCode,int age, double salary, LocalDate hireDate) {
        count += 1;
        //purple color on the name defines the value is for String name, Employee class
        this.firstName = firstName;
        this.middleName = Objects.requireNonNullElse(middleName, "Unknown");
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.pinCode = pinCode;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static int getCount() {
        return count;
    }

    public void raiseSalary(double percentage) {
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
