package main.test;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements IHotel {
    private String name;
    private int countOfResident;
    private List<Resident> residentList = new ArrayList<>();
    private List<Room> roomList = new ArrayList<>();

    @Override
    public boolean checkIn(Resident resident) {
        boolean isCheckIn = false;
        if (residentList.size() < countOfResident) {
            isCheckIn = true;
            residentList.add(resident);
            Room.buildRoom().checkIn(resident);
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

    public List<Resident> getResidentList() {
        return residentList;
    }

    public void setResidentList(List<Resident> residentList) {
        this.residentList = residentList;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", countOfResident=" + countOfResident +
                ", residentList=" + residentList +
                '}';
    }
}
