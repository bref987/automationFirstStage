package com.epam.automation.slutski.cleancode;

import com.epam.automation.slutski.cleancode.models.ClassificationLevel;
import com.epam.automation.slutski.cleancode.models.ExperimentalTypes;
import com.epam.automation.slutski.cleancode.models.MilitaryTypes;
import com.epam.automation.slutski.cleancode.planes.ExperimentalPlane;
import com.epam.automation.slutski.cleancode.planes.MilitaryPlane;
import com.epam.automation.slutski.cleancode.planes.PassengerPlane;
import com.epam.automation.slutski.cleancode.planes.Plane;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AirportTest {
    private static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryTypes.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryTypes.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryTypes.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryTypes.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryTypes.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryTypes.TRANSPORT),
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypes.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypes.VTOL, ClassificationLevel.TOP_SECRET)
    );

    @Test
    public void testHasAtLeastOneTransportMilitaryPlane() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        assertTrue(transportMilitaryPlanes.size() > 0);
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        PassengerPlane expectedPlaneWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);
        Airport airport = new Airport(planes);
        PassengerPlane planeWithMaxPassengerCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        assertEquals(expectedPlaneWithMaxPassengerCapacity, planeWithMaxPassengerCapacity);
    }

    @Test
    public void nextPlaneMaxLoadCapacityIsHigherThanCurrent() {
        Airport airport = new Airport(planes);
        airport.sortByMaxLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();
        Plane currentPlane = planesSortedByMaxLoadCapacity.get(0);
        Plane nextPlane = planesSortedByMaxLoadCapacity.get(1);
        assertFalse(currentPlane.getMaxLoadCapacity() > nextPlane.getMaxLoadCapacity());
    }

    @Test
    public void testHasAtLeastOneBomberMilitaryPlane() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        assertTrue(bomberMilitaryPlanes.size() > 0);
    }

    @Test
    public void testHasAtLeastOneUnclassifiedExperimentalPlane() {
        Airport airport = new Airport(planes);
        List<ExperimentalPlane> unclassifiedExperimentalPlanes = airport.getUnclassifiedExperimentalPlanes();
        assertFalse(unclassifiedExperimentalPlanes.size() > 0);
    }
}
