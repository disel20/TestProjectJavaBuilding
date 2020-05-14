package main.construction.dao;

import main.construction.room.Room;

import java.util.List;

public interface IRoomDao {

    void add(Room room);

    Room getById(long id);

    List<Room> getAll();

    void update(Room room);

    void delete(long id);

}
