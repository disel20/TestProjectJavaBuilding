package main.construction;

import java.util.Arrays;

public class Floor {

    private String name;
    private Apartment[] apartments;

    public Floor(String name, int numberOfRooms) {
        this.name = name;
        this.apartments = new Apartment[numberOfRooms];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public boolean addApartment(Apartment apartment) {
        boolean isAdded = false;
        for (int i = 0; i < apartments.length; i++) {
            if (apartments[i] == null) {
                apartments[i] = apartment;
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "name='" + name + '\'' +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }
}
