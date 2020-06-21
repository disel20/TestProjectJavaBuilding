package main.four;

public interface IRoom {

    boolean checkIn(Resident resident);

    void checkOut(Resident resident);

    void checkOutAll();
}
