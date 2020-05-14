package main.business.repository;

import main.business.Guest;

import java.util.List;

public interface IGuestRepository {
    void add(Guest guest);
    Guest getByLastName(String lastName);
    void updateGuest(Guest guest);
    void removeGuest(String lastName);
    List<Guest> listGuest();
}
