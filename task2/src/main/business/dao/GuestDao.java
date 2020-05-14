package main.business.dao;

import main.business.Guest;
import main.business.repository.IGuestRepository;
import main.business.repository.GuestRepository;

import java.util.List;

public class GuestDao implements IGuestDao {

    private IGuestRepository repository = new GuestRepository();

    @Override
    public void addGuest(Guest guest) {
        repository.add(guest);
        System.out.println("New guest added: " + guest.getLastName());
    }

    @Override
    public Guest getByLastName(String lastName) {
        return null;
    }

    @Override
    public void updateGuest(Guest guest) {

    }

    @Override
    public void removeGuest(String lastName) {

    }

    @Override
    public List<Guest> listGuest() {
        return null;
    }
}
