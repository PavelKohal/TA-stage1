package by.epamtc.automation.cleancode;

import by.epamtc.automation.cleancode.models.MilitaryType;
import by.epamtc.automation.cleancode.planes.ExperimentalPlane;
import by.epamtc.automation.cleancode.planes.MilitaryPlane;
import by.epamtc.automation.cleancode.planes.PassengerPlane;
import by.epamtc.automation.cleancode.planes.Plane;

import java.util.*;
import java.util.stream.Collectors;

public class Airport {

    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = (List<PassengerPlane>) planes.stream()
                .filter(plane -> plane instanceof PassengerPlane).collect(Collectors.toList());
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = (List<MilitaryPlane>) planes.stream()
                .filter(plane -> plane instanceof MilitaryPlane).collect(Collectors.toList());
        return militaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = (List<ExperimentalPlane>) planes.stream()
                .filter(plane -> plane instanceof ExperimentalPlane).collect(Collectors.toList());
            return experimentalPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        return passengerPlanes.stream().max(Comparator.comparing(PassengerPlane::getPassengersCapacity))
                .orElseThrow(NoSuchElementException::new);
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = getMilitaryPlanes().stream()
                .filter(plane -> MilitaryType.TRANSPORT.equals(plane.getType())).collect(Collectors.toList());
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = getMilitaryPlanes().stream()
                .filter(plane -> MilitaryType.BOMBER.equals(plane.getType())).collect(Collectors.toList());
        return bomberMilitaryPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
            }
        });
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxSpeed() - o2.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxLoadCapacity() - o2.getMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }
}
