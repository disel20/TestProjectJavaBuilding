package main.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelApp {

    private static int residentInfoCount = 1;

    public static void main(String[] args) {

        //I didn't understand yet how will help me hotel class, but I created it
        Hotel californiya = new Hotel("Californiya", 20);

        List<Resident> residentList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            residentList.add(Resident.buildResident());
        }
        System.out.println("after build resident:");
        System.out.println(residentList);
        System.out.println();

        List<Room> roomList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            roomList.add(Room.buildRoom());
            System.out.println(roomList.get(i));
        }

        //here will do check in
        try {
            int r = 0;
            for (int j = 0; j < residentList.size(); j++) {
                if (roomList.get(r).checkIn(residentList.get(j)) == false) {
                    r++;
                    j--;
                }
            }
        }
        catch (Exception e) {
            System.out.println();
            System.out.println("All rooms are occupied, please call administrator");
            System.out.println();
        }

        for (int i = 0; i < roomList.size(); i++) {
            System.out.println("After check in: " + roomList.get(i));
        }

        //one resident decided to take more rooms
        roomList.get(4).checkIn(residentList.get(2));
        roomList.get(2).checkIn(residentList.get(2));

        //let's go search last names in our rooms
        System.out.println();
        System.out.println("Search in last names...");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a sought last name: ");
        String findLastName = in.nextLine();
        in.close();
        boolean isFound = false;
        for (int j = 0; j < roomList.size(); j++) {
            for (int i = 0; i < roomList.get(j).getResidentList().size(); i++) {
                String lastName = roomList.get(j).getResidentList().get(i).getResidentInfo().getLastName();
                String roomNumber = roomList.get(j).getNumber();
                if (lastName.equals(findLastName)) {
                    System.out.println(findLastName + " found in room " + roomNumber);
                    System.out.println();
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("Nothing found");
        }
    }
}
