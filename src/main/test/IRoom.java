package main.test;

public interface IRoom {

    boolean checkIn(Resident resident);

    void checkOut(Resident resident);

    void checkOutAll();

    void searchLastName(String lastName);
}
