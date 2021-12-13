package day7;

/**
 * example of conversions between Numeric types
 * Implicit type casting
 */

public class ImplicitTypeCasting {

    public static void main(String[] args) {
        byte b = 22;   //no explicit type casting required
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;


        System.out.println("byte value is: " + b);
        System.out.println("short value is: " + s);
        System.out.println("int value is: " + i);
        System.out.println("long value is: " + l);
        System.out.println("float value is: " + f);
        System.out.println("double value is: " + d);

        char ch1 = 'S';
        double d1 = ch1;
        System.out.println(d1);     // prints 83
        System.out.println(ch1 * ch1); // multiplies 83*83 and prints 6889

        char ch2 ='I';
        double d2 =ch2;
        System.out.println(d2); //prints 73
        System.out.println(ch2 + ch2);  // adds 73*73 and prints 146

        char ch3 ='R';
        double d3 =ch3;
        System.out.println(d3); //prints 82
        System.out.println(ch3 - ch3);  // subtracts 82*82 and prints 0

        char ch4 ='E';
        double d4 =ch4;
        System.out.println(d4);     //prints 69
        System.out.println(ch4 / ch4 * ch4);    // multiplies 69*69 then divides 4761/69 and prints 69


    }


}
