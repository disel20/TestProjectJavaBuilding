package main.four;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements IHotel {
    private String name;
    private List<Room> roomList = new ArrayList<>();
    private List<Service> serviceList = new ArrayList<>();

    @Override
    public void addRoom(Room room) {
        roomList.add(Room.buildRoom());
    }

    @Override
    public void getRoom() {
    }

    @Override
    public void removeRoom() {

    }

    @Override
    public void addService(Service service) {
    }

    @Override
    public void getService() {

    }

    @Override
    public void removeService() {

    }
}
