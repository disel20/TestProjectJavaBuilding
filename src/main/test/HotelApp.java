package main.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelApp {

    private static int residentInfoCount = 1;

    public static void main(String[] args) {

        List<Resident> residentList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            residentList.add(Resident.buildResident());
        }
        System.out.println("after build resident:");
        System.out.println(residentList);
        System.out.println();

        List<Room> roomList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            roomList.add(Room.buildRoom());
            System.out.println(roomList.get(i));
        }

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

        roomList.get(6).checkIn(residentList.get(11));
        System.out.println(roomList.get(6));

        //here will be find in last names, BUT this method doesn't work with 1 resident has 2 rooms
        System.out.println();
        System.out.println("Search in last names:");
        Scanner in = new Scanner(System.in);
        System.out.println("Input searching last name: ");
        String lastName = in.nextLine();
        in.close();
        for (int i = 0; i < roomList.size(); i++) {
            roomList.get(i).findResident(lastName);
        }


    }
}
