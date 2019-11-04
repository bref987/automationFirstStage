package com.epam.automation.slutski.classes;

public class CarController {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car(58, 1065),
                new Car(48, 1098),
                new Car(54, 1098),
                new Car(16, "audi", "100", 1995, "black", 2000, 1548),
                new Car(86, "volkswagen", "passat", 2000, "orange", 3000, 7852),
                new Car(11, "volvo", "s80", 2005, "blue", 4000, 2536),
                new Car(76, "audi", "100", 1995, "black", 2000, 1598),
                new Car(36, "volkswagen", "passat", 2000, "orange", 3000, 7752),
                new Car(41, "volvo", "s80", 2005, "blue", 4000, 2576),
                new Car(11, "porsche", "911", 2010, "red", 44000, 2536)
        };

        CarSelection car = new CarSelection(cars);

        String marque = "zaz";
        String model = "s80";
        int exploitationYear = 5;
        int manufactureYear = 2010;
        double price = 43000;

        System.out.println("Car(s) of one marque: " + marque);
        CarView.printCars(car.getCarsOfOneMarque(marque));

        System.out.println("Car(s) of one model older than set year: " + exploitationYear);
        CarView.printCars(car.getCarsOfSetModelAndExploitationPeriod(model, exploitationYear));

        System.out.println("Car(s) of set manufacture year " + manufactureYear +
                " with price higher than set price: " + price);
        CarView.printCars(car.getCarsOfSetYearAndHigherPrice(manufactureYear, price));
    }
}
