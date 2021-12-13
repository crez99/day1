package day5;

import java.time.LocalDate; //used to get the current local date
import java.util.Objects;

/**
 * This class is used to get details of the employee.
 */

public class Employee {

    private String firstName; // mandatory
    private String middleName;  //optional
    private String lastName;    //mandatory
    private String socialSecurityNumber;    //encapsulation method used
    private String pinCode;
    private int age;    //mandatory
    private double salary;  //mandatory
    private LocalDate hireDate;     //mandatory
    private static int count = 0;     //adding static helps to run same variable

    //set as private so the users can't edit the fields
    private Employee() {
    }  //it is a default constructor. no value needed to be passed

    /**
     * using two Parameterized Constructor to get the data.
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber, String pinCode, int age, double salary, LocalDate hireDate) {
        count += 1;     //
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

    /**
     *purple color on the name defines the value is for String name, Employee class
     *parameters names easy method for two constructors of same class
     */
    public Employee(String firstName, String middleName, String lastName, String socialSecurityNumber, String pinCode, int age, double salary, LocalDate hireDate) {

        this(firstName, lastName, socialSecurityNumber, pinCode, age, salary, hireDate); //always write on the first line of the constructor
        this.middleName = Objects.requireNonNullElse(middleName, "Unknown");

    }

    // generating getters

    /**
     * used to generate first name
     *
     * @return firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * used to generate middlename
     * @return middlename
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * used to generate lastname
     * @return lastname
     */


    public String getLastName() {
        return lastName;
    }

    /**
     * used to generate age
     *
     * @return age
     */

    public int getAge() {
        return age;
    }

    /**
     * used to generate salary amount
     *
     * @return salary
     */

    public double getSalary() {
        return salary;
    }

    /**
     * used to generate localdate
     *
     * @return hiredate
     */

    public LocalDate getHireDate() {
        return hireDate;
    }


    // setting up setters which is accessible to the users


    /**
     * setting up the lastname
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * setting up the age
     *
     * @param age
     */

    public void setAge(int age) {
        this.age = age;
    }


    public static int getCount() {
        return count;
    }

    /**
     * method used to calculate the percentage increase in salary.
     *
     * @param percentage this is the number for which the salary amount is to be increased.
     */
    public void raiseSalary(double percentage) {
        this.salary += (this.salary * percentage) / 100;
    }


    /**
     * method used to display employee details
     * display includes firstname,middlename,lastname,age,salary,hiredate
     */


    public void displayEmployeeDetail() {
        System.out.println(this.firstName);
        System.out.println(this.middleName);
        System.out.println(this.lastName);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println(this.hireDate.toString()); //changed to null.toString
    }


}
