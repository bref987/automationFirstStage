package com.epam.automation.slutski.cleancode.planes;

import com.epam.automation.slutski.cleancode.models.ClassificationLevel;
import com.epam.automation.slutski.cleancode.models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private ClassificationLevel classificationLevel;
    private ExperimentalTypes type;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.classificationLevel = classificationLevel;
        this.type = type;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public ExperimentalTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + getModel() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
