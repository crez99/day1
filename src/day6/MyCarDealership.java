package day6;

public class MyCarDealership {

    public static void main (String[] args) {

        //initial count of the inventory

        System.out.println(Inventory.getCount());
        System.out.println(Inventory.getCount());
        System.out.println(Inventory.getCount());
        System.out.println(Inventory.getCount());
        System.out.println(Inventory.getCount());

        Inventory.increaseCount();
        Inventory.increaseCount();
        Inventory.decreaseCount();
        Inventory.increaseCount();
        Inventory.increaseCount();

        Inventory.decreaseCount();
        Inventory.increaseCount();
        Inventory.increaseCount();
        Inventory.increaseCount();
        Inventory.decreaseCount();
        Inventory.increaseCount();
        Inventory.increaseCount();
        Inventory.decreaseCount();


        //count after the calculation of inventory

        System.out.println(Inventory.getCount());
        System.out.println(Inventory.getCount());
        System.out.println(Inventory.getCount());
        System.out.println(Inventory.getCount());
        System.out.println(Inventory.getCount());

    }
}
