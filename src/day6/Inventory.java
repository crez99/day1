package day6;

public class Inventory {

    private static int carInAndOut;

    private Inventory(){}

    public static void increaseCount(){carInAndOut+=1;}  //increase when a car is imported

    public static void decreaseCount(){carInAndOut-=1;}     //decrease when the car is sold

    public static int getCount(){return carInAndOut;}       // get the final count of the inventory after calculations

}
