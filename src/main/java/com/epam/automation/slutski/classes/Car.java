package com.epam.automation.slutski.classes;

public class Car {
    private int id;
    private String marque;
    private String model;
    private int manufactureYear;
    private String color;
    private double price;
    private int plateNumber;

    public Car() {
        super();
    }

    public Car(int id, int plateNumber) {
        this.id = id;
        this.marque = "zaz";
        this.model = "965";
        this.manufactureYear = 1960;
        this.color = "red";
        this.price = 150;
        this.plateNumber = plateNumber;
    }

    public Car(int id, String marque, String model, int manufactureYear, String color, double price, int plateNumber) {
        this.id = id;
        this.marque = marque;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.color = color;
        this.price = price;
        this.plateNumber = plateNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", plateNumber=" + plateNumber +
                "}";
    }
}
