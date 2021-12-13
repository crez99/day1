package day9;

public class ConditionalPractice {
    public static void main(String[] args) {

    int sales = 80;
    int target =10;
    if (sales >=2 * target){
        System.out.println("Excellent");
    }
    else if (sales >=1.5* target){
        System.out.print("BETTER");
    }
    else {
        System.out.print("fired");
    }

    }
}
