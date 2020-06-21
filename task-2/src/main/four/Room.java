package main.four;

import java.util.ArrayList;
import java.util.List;

public class Room implements IRoom {

    public static int countRoom = 1;
    public static int buildCountOfResident = 0;
    public static boolean isRepairRoom = false;

    private String number;
    private int countOfResident;
    private List<Resident> residentList = new ArrayList<>();

    private double price;

    public Room(String number, int countOfResident) {
        this.number = number;
        this.countOfResident = countOfResident;
    }

    public static Room buildRoom() {
        int maxOfResidentInRoom = 4;
        String number = String.format("number_%d", countRoom);
        if (buildCountOfResident < maxOfResidentInRoom) {
            buildCountOfResident++;
        }
        else {
            buildCountOfResident = 1;
        }
        countRoom++;
        return new Room(number, buildCountOfResident);
    }

    public boolean changeRoomCondition(Room room) {
        isRepairRoom = true;
        System.out.println("Room " + room.getNumber() + " is being renovated");
        return isRepairRoom;
    }

    @Override
    public boolean checkIn(Resident resident) {
        boolean isCheckIn = false;
        if (residentList.size() < countOfResident && !isRepairRoom) {
            isCheckIn = true;
            residentList.add(resident);
            resident.setRoom(this);
        }
        System.out.println("CheckIn: " + isCheckIn + " " + resident);
        return isCheckIn;
    }

    @Override
    public void checkOut(Resident resident) {
        residentList.remove(resident);
        resident.setRoom(null);
    }

    @Override
    public void checkOutAll() {
        for (Resident resident : residentList) {
            resident.setRoom(null);
        }
        residentList.clear();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setResidentList(List<Resident> residentList) {
        this.residentList = residentList;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number='" + number + '\'' +
                ", countOfResident=" + countOfResident +
                ", residentList=" + residentList +
                '}';
    }
}
