package main.construction;

import main.construction.room.Room;

public class Apartment extends Buildings {

    private String name;
    private Room[] rooms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        if (rooms == null) {
            rooms = new Room[1];
            rooms[0] = room;
        } else {
            Room[] newArrayRooms = new Room[rooms.length + 1];
            for (int i = 0; i < rooms.length; i++) {
                newArrayRooms[i] = rooms[i];
            }
            rooms = newArrayRooms;

            rooms[rooms.length -1] = room;
        }
    }

    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        Room room = new Room();
        room.setName("first");
        Room room1 = new Room();
        room1.setName("second");

        apartment.addRoom(room);
        apartment.addRoom(room1);

        Room[] rooms = apartment.getRooms();
        Room replaceRoom = rooms[0];
        replaceRoom.setName("replace first");

//        apartment.getRooms()[0].setName("replace first");
    }
}
