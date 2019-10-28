package com.epam.automation.slutski.cleancode;

import com.epam.automation.slutski.cleancode.models.ClassificationLevel;
import com.epam.automation.slutski.cleancode.planes.Plane;
import com.epam.automation.slutski.cleancode.planes.ExperimentalPlane;
import com.epam.automation.slutski.cleancode.models.MilitaryTypes;
import com.epam.automation.slutski.cleancode.planes.MilitaryPlane;
import com.epam.automation.slutski.cleancode.planes.PassengerPlane;

import java.util.*;

/**
 * @author Aleh Slutski
 * @version 1.0
 * @since 28-10-2019
 */

public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryTypes.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryTypes.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }

    public List<ExperimentalPlane> getUnclassifiedExperimentalPlanes() {
       List <ExperimentalPlane> unclassifiedExperimentalPlanes = new ArrayList<>();
       List <ExperimentalPlane> experimentalPlanes = getExperimentalPlanes();
        for (int i = 0; i < experimentalPlanes.size(); i++) {
            ExperimentalPlane plane = experimentalPlanes.get(i);
            if (plane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED) {
                unclassifiedExperimentalPlanes.add(plane);
            }
        }
        return unclassifiedExperimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        planes.sort((Plane a, Plane b) -> a.getMaxFlightDistance() - b.getMaxFlightDistance());
        return this;
    }

    public Airport sortByMaxSpeed() {
        planes.sort((Plane a, Plane b) -> a.getMaxSpeed() - b.getMaxSpeed());
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        planes.sort((Plane a, Plane b) -> a.getMaxLoadCapacity() - b.getMaxLoadCapacity());
        return this;
    }

    @Override
    public String toString() {
        return "Airport{Planes=" + planes.toString() + "}";
    }
}
