package main.business;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Save implements Serializable {

    private Guest guest;

    public Save(Guest guest) {
        this.guest = guest;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "Save{" +
                "guest=" + guest +
                '}';
    }
}
