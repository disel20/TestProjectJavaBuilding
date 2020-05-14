package main.construction.repository;

import main.construction.room.Room;

import java.util.List;

public interface IRoomRepository {

    void add(Room room);

    Room getById(long id);

    List<Room> getAll();

    void update(Room room);

    void delete(long id);

}
