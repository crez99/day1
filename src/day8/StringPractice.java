package day8;

/**
 * this class is a string practice class.
 * includes string,substring,trim,length,uppercase,lowercase,character,index,lastindex
 */


public class StringPractice {

    public static void main(String[] args) {

        String s1 = "USA";      //STRING ONE IS USA
        String s2 = "USA";      //STRING TWO IS USA
        System.out.println(s1 == s2);   //CHECKS IF S1=S2 AND PRINTS THE RESULT AS TRUE OR FALSE
        String s3 = "U" + "SA";  //STRING THREE IS U + SA
        System.out.println(s1 == s3); //CHECKS IF S1=S3 AND PRINTS THE RESULT AS TRUE OR FALSE
        String s4 = "U"; //STRING FOUR IS U
        String s5 = s4 + "SA"; //STRING 5 IS S4(U) + SA
        System.out.println(s1 == s5); //CHECKS IF S1=S5 AND PRINTS THE RESULT AS TRUE OR FALSE
        System.out.println("length= " + s1.length()); //PRINTS THE TOTAL NUMBER OF THE STRING
        System.out.println(s1.equals(s2)); //CHECKS THE CONDITION IF S1=S2 AND PRINTS IF TRUE OR FALSE
        System.out.println(s1.equals(s4)); //CHECKS THE CONDITION IF S1=S4 AND PRINTS IF TRUE OR FALSE
        System.out.println("to upper case " + s1.toUpperCase()); //PRINTS THE STRING S1 INTO UPPER CASE
        System.out.println("USA".toLowerCase()); //PRINTS THE STRING USA INTO LOWER CASE
        System.out.println(s1.substring(1)); //EXTRACTS A SUBSTRING FROM USA AND PRINTS THE REMAINING STRING
        System.out.println(s1); //PRINTS THE STRING S1
        System.out.println("   Sireej Pradhan ".trim()); //removes extra space on the string and prints the final outcome
        System.out.println(s1.charAt(0)); //prints the character on the 0 position of the string s1
        System.out.println(s1.indexOf("U")); //PRINTS THE POSITION OF U IN STRING S1 WHICH IS 0
        System.out.println(s1.lastIndexOf("A")); //Prints the last position of A in string s1 which is 2
        System.out.println(s1); //prints string s1
    }


}
