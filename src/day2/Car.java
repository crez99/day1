package day2;


public class Car {

    //States
    String Country;
    String Make;
    String Model;
    short Year;
    String Type;
    short numberOfMiles;

    //behaviour

    void isFourDoor() {

    }

    void isGreatOnMileage() {

    }

    void isGoodFamilyCar() {
    }

    void isNotExpensive() {

    }

    void isTheBestSellingCar() {

    }

    public static void main(String[] args) {
        Car tesla = new Car();
        Car ford = new Car();
        Car gmc = new Car();
        Car toyota = new Car();
        Car hyundai = new Car();


        tesla.Country = "usa";
        tesla.Make = "tesla";
        tesla.Model = "Y";
        tesla.Year = 2020;
        tesla.Type = "sedan";
        tesla.numberOfMiles = 500;

        ford.Country = "usa";
        ford.Make = "ford";
        ford.Model = "ranger";
        ford.Year = 2021;
        ford.Type = "truck";
        ford.numberOfMiles = 2200;

        gmc.Country = "usa";
        gmc.Make = "gmc";
        gmc.Model = "yukon";
        gmc.Year = 2019;
        gmc.Type = "suv";
        gmc.numberOfMiles = 4000;

        toyota.Country = "usa";
        toyota.Make = "toyota";
        toyota.Model = "rav4";
        toyota.Year = 2015;
        toyota.Type = "suv";
        toyota.numberOfMiles = 2400;

        hyundai.Country = "usa";
        hyundai.Make = "hyundai";
        hyundai.Model = "tucson";
        hyundai.Year = 2021;
        hyundai.Type = "suv";
        hyundai.numberOfMiles = 2200;

    }
}



