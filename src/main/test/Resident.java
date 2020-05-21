package main.test;

import java.util.ArrayList;
import java.util.List;

public class Resident {
    private ResidentInfo residentInfo;
    private Room room;

    public Resident(ResidentInfo residentInfo) {
        this.residentInfo = residentInfo;
    }

    public static Resident buildResident() {
        return new Resident(ResidentInfo.buildResidentInfo());
    }

    public ResidentInfo getResidentInfo() {
        return residentInfo;
    }

    public void setResidentInfo(ResidentInfo residentInfo) {
        this.residentInfo = residentInfo;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Resident{" +
                "residentInfo=" + residentInfo +
                '}';
    }
}
