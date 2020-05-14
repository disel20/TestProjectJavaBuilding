package main.business;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Guest guest = new Guest();

        Save saveWrite = new Save(guest);
        FileOutputStream fileOutputStream = new FileOutputStream("w:\\GuestSerializable.csv");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(saveWrite);

        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("w:\\GuestSerializable.csv");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Save saveRead = (Save)objectInputStream.readObject();

        objectInputStream.close();
    }
}
