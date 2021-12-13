package day7;

public class ExplicitTypeCasting {


    /**
     * example of conversions between Numeric types
     * Explicit type casting
     */


    public static void main(String[] args) {
        double d = 350.20;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println("double value is: " + d);
        System.out.println("float value is: " + f);
        System.out.println("long value is: " + l);
        System.out.println("int value is: " + i);
        System.out.println("short value is: " + s);
        System.out.println("byte value is: " + b);

        byte bb = (byte) 800;
        System.out.println(bb);
        byte by = (byte) d;
    }


}

