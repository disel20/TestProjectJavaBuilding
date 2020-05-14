package main.construction.repository;

import main.construction.room.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository implements IRoomRepository {

    private List<Room> rooms = new ArrayList<>();

    @Override
    public void add(Room room) {

    }

    @Override
    public Room getById(long id) {
        return rooms.get((int) id);
    }

    @Override
    public List<Room> getAll() {
        return null;
    }

    @Override
    public void update(Room room) {

    }

    @Override
    public void delete(long id) {

    }
}
