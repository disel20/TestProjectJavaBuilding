package main.test;

public interface IHotel {
    boolean checkIn(Resident resident);
    void checkOut(Resident resident);
    void checkOutAll();
}
