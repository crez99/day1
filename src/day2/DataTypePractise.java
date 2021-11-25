package day2;

public class DataTypePractise {
    int a;
    float b;
    boolean isTrue;
    char d;

    public void display() {
        int g = 9;
        System.out.println("a is:" + a);
        System.out.println("b is:" + b);
        System.out.println("isTrue is:" + isTrue);
        System.out.println("g is:" + g);
        System.out.println("d is:" + d);

    }


    public static void main(String[] args) {

        DataTypePractise dp = new DataTypePractise();
        dp.display();
    }
}