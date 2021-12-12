package day6;

public class Counter {              //utility class. dont have to make objects

    private static int personCount;

    private Counter(){}

    public static void increaseCount(){
        personCount += 1;
    }

    public static void decreaseCount(){
        personCount -=1;
    }

    public static int getCount(){
        return personCount;
    }
}
