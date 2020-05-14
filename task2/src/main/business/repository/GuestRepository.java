package main.business.repository;

import main.business.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestRepository implements IGuestRepository {

    private List<Guest> listGuest = new ArrayList<>();

    @Override
    public void add(Guest guest) {

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
