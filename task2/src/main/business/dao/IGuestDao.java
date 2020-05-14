package main.business.dao;

import main.business.Guest;

import java.util.List;

public interface IGuestDao {
    public void addGuest(Guest guest);
    public Guest getByLastName(String lastName);
    public void updateGuest(Guest guest);
    public void removeGuest(String lastName);
    public List<Guest> listGuest();
}
