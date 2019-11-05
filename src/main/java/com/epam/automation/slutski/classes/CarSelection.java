package com.epam.automation.slutski.classes;

import java.time.Year;
import java.util.Arrays;

public class CarSelection {
    private Car[] cars;

    public CarSelection(Car[] cars) {
        this.cars = cars;
    }

    public Car[] getCarsOfOneMarque(String marque) {
        int countMarques = 0;
        String marquesIndexes = "";
        Car[] marques;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getMarque() == marque) {
                countMarques += 1;
                marquesIndexes = marquesIndexes + i + "_";
            }
        }

        marques = new Car[countMarques];
        for (int i = 0; i < countMarques; i++) {
            marques[i] = cars[Integer.parseInt(marquesIndexes.split("_")[i])];
        }
        return marques;
    }

    public Car[] getCarsOfOneModel(String model) {
        int countModels = 0;
        String modelsIndexes = "";
        Car[] models;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getModel() == model) {
                countModels += 1;
                modelsIndexes = modelsIndexes + i + "_";
            }
        }

        models = new Car[countModels];
        for (int i = 0; i < countModels; i++) {
            models[i] = cars[Integer.parseInt(modelsIndexes.split("_")[i])];
        }
        return models;
    }

    public Car[] getCarsOfSetYear(int year) {
        int countCarsOfSetYear = 0;
        String carsOfSetYearIndexes = "";
        Car[] carsOfSetYear;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getManufactureYear() == year) {
                countCarsOfSetYear += 1;
                carsOfSetYearIndexes = carsOfSetYearIndexes + i + "_";
            }
        }

        carsOfSetYear = new Car[countCarsOfSetYear];
        for (int i = 0; i < countCarsOfSetYear; i++) {
            carsOfSetYear[i] = cars[Integer.parseInt(carsOfSetYearIndexes.split("_")[i])];
        }
        return carsOfSetYear;
    }

    public Car[] getCarsOfSetModelAndExploitationPeriod(String model, int exploitationYears) {
        Car[] models = getCarsOfOneModel(model);
        Car[] usedModelCars;
        int countUsedModelCars = 0;
        String usedModelCarsIndexes = "";

        for (int i = 0; i < models.length; i++) {
            int realExploitationPeriod = Year.now().getValue() - models[i].getManufactureYear();
            if (realExploitationPeriod > exploitationYears) {
                countUsedModelCars += 1;
                usedModelCarsIndexes = usedModelCarsIndexes + i + "_";
            }
        }

        usedModelCars = new Car[countUsedModelCars];
        for (int i = 0; i < countUsedModelCars; i++) {
            usedModelCars[i] = models[Integer.parseInt(usedModelCarsIndexes.split("_")[i])];
        }
        return usedModelCars;
    }

    public Car[] getCarsOfSetYearAndHigherPrice(int manufactureYear, double price) {
        Car[] manufactureYearCars = getCarsOfSetYear(manufactureYear);
        Car[] carsOfSetYearWithHigherSetPrice;
        int countSetYearWithHigherSetPriceCars = 0;
        String setYearWithHigherSetPriceCarsIndexes = "";

        for (int i = 0; i < manufactureYearCars.length; i++) {
            if (manufactureYearCars[i].getPrice() > price) {
                countSetYearWithHigherSetPriceCars += 1;
                setYearWithHigherSetPriceCarsIndexes = setYearWithHigherSetPriceCarsIndexes + i + "_";
            }
        }

        carsOfSetYearWithHigherSetPrice = new Car[countSetYearWithHigherSetPriceCars];
        for (int i = 0; i < countSetYearWithHigherSetPriceCars; i++) {
            carsOfSetYearWithHigherSetPrice[i] =
                    manufactureYearCars[Integer.parseInt(setYearWithHigherSetPriceCarsIndexes.split("_")[i])];
        }
        return carsOfSetYearWithHigherSetPrice;
    }

    @Override
    public String toString() {
        return "CarSelection{" +
                "cars=" + Arrays.toString(cars) +
                "}";
    }
}
