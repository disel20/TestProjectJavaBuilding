package main.construction.dao;

import main.construction.repository.IRoomRepository;
import main.construction.repository.RoomRepository;
import main.construction.room.Room;

import java.util.List;

public class RoomDao implements IRoomDao {

    private IRoomRepository repository = new RoomRepository();

    @Override
    public void add(Room room) {
        System.out.println("added new room into: " + repository.getClass().getSimpleName());
        repository.add(room);
    }

    @Override
    public Room getById(long id) {
        return repository.getById(id);
    }

    @Override
    public List<Room> getAll() {
        return repository.getAll();
    }

    @Override
    public void update(Room room) {
        repository.update(room);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }
}
