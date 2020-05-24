package main.test;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements IHotel {
    private String name;
    private int countOfResident;
    private List<Resident> checkInList;
    private static List<Room> roomList;

    public Hotel(String name, int countOfResident) {
        this.name = name;
        this.countOfResident = countOfResident;
    }

    @Override
    public boolean checkIn(Resident resident) {
        boolean isCheckIn = false;
        if (checkInList.size() < countOfResident) {
            isCheckIn = true;
            checkInList.add(resident);
            //Room.buildRoom().checkIn(resident);
        }
        System.out.println("CheckIn: " + isCheckIn + " " + resident);
        return isCheckIn;
    }

    @Override
    public void checkOut(Resident resident) {

    }

    @Override
    public void checkOutAll() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfResident() {
        return countOfResident;
    }

    public void setCountOfResident(int countOfResident) {
        this.countOfResident = countOfResident;
    }

    public List<Resident> getCheckInList() {
        return checkInList;
    }

    public void setCheckInList(List<Resident> checkInList) {
        this.checkInList = checkInList;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", countOfResident=" + countOfResident +
                ", checkInList=" + checkInList +
                '}';
    }
}
