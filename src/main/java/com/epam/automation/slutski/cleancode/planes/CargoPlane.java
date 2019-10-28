package com.epam.automation.slutski.cleancode.planes;

import java.util.Objects;

public class CargoPlane extends Plane {

    private int cargoCapacity;

    public CargoPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int cargoCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", cargoCapacity=" + cargoCapacity +
                        "}");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoPlane)) return false;
        if (!super.equals(o)) return false;
        CargoPlane plane = (CargoPlane) o;
        return cargoCapacity == plane.cargoCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoCapacity);
    }
}
