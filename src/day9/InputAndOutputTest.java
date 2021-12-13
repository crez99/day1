package day9;

import java.util.Scanner; //imports scanner class from folder java-utils

/**
 * this class takes input from the user
 */

public class InputAndOutputTest {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // this is a scanner class object

        //string case
        System.out.println("What is your Name?"); //takes string from user as input
        String name=in.nextLine();  //holds the value input by the user and this method holds multiple value

        System.out.println("What is your Address?"); //takes string from user as input
        String address=in.next(); //holds the value input by the user and this method holds only one value

        // integer case
        System.out.println("How old are you?");
        int age = in.nextInt();     // takes number input from the user, can't read any string

        System.out.println("What is your password?");
        String password=in.next();

        System.out.printf("Name is : %s " , name); //prints age when user inputs the age in the program
        System.out.println("Address is : " + address);
        System.out.println("Age is : " + age);
        System.out.println("Password is : " + password);



    }
}


//    Console cons = System.console();
//    String username = cons.readLine("User name: ");
//    char[] passwd = cons.readPassword("Password: ");
