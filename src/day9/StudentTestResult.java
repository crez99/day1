package day9;

import java.util.Scanner;

/**
 * this class takes the input from users, calculates their marks and displays their percentage,average marks, grade.
 */
public class StudentTestResult {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // this is a scanner class object

        System.out.println("What is your Name?"); //takes string from user as input
        String name = in.nextLine();  //holds the value input by the user and this method holds multiple value

        System.out.println("What is your RollNumber?");
        String rollnumber = in.nextLine();

        System.out.println("Marks in Maths?"); //takes string from user as input
        double maths = in.nextDouble(); //holds the value input by the user and this method can hold decimal point

        System.out.println("Marks in Science?");
        double science = in.nextDouble();

        System.out.println("Marks in English?");
        double english = in.nextDouble();

        System.out.println("Marks in Nepali?");
        double nepali = in.nextDouble();

        System.out.println("Marks in Social?");
        double social = in.nextDouble();

        System.out.println("Marks in Humanities?");
        double humanities = in.nextDouble();


        //total marks of the subject
        double fullMarks = 600;

        //total marks obtained by the student
        double total = maths + science + english + nepali + social + humanities;
        double average = total / 6; // the average is obtained through this function


        /**
         * here the programs displays the users name,roll number and marks of the subjects
         * \n is the line break
         * %s indicates the string
         * %.2f indicates the fixed point floating with two decimal points only
         */
        System.out.printf("Name is : %s\n ", name);
        System.out.printf("Roll Number is : %s\n\n ", rollnumber);
        System.out.printf("Full Marks is : %s\n\n ", fullMarks);
        System.out.printf("Marks in Maths is : %.2f\n", maths);
        System.out.printf("Marks in Science is : %.2f\n ", science);
        System.out.printf("Marks in English is : %.2f\n ", english);
        System.out.printf("Marks in Nepali is : %.2f\n ", nepali);
        System.out.printf("Marks in Social is : %.2f\n ", social);
        System.out.printf("Marks in Humanities is : %.2f\n\n ", humanities);
        System.out.printf("Your Total Marks Obtained is : %.2f\n ", total);


        /**
         * this method is used to take out the percentage scored by the student
         */

            double percentage= (total/fullMarks*100);
            System.out.printf("Your Percentage is : %.2f%%\n ", percentage);



        /**
         * using if else condition to determine the grade of the students
         */

        if (average >= 90) {
            System.out.printf("Your Average Score is : %2f and your grade is A\n: ", average);
        } else if (average >= 80) {
            System.out.printf("Your Average Score is : %2f and your grade is B\n", average);
        } else if (average >= 70) {
            System.out.printf("Your Average Score is : %2f and your grade is C\n", average);
        } else if (average >= 60) {
            System.out.printf("Your Average Score is : %2f and your grade is D\n", average);
        } else if (average >= 50) {
            System.out.printf("Your Average Score is : %2f and your grade is E\n", average);
        } else {
            System.out.printf("Your Average Score is : %2f and your grade is F\n", average);
        }

    }

}
