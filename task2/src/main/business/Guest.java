package main.business;

import java.io.Serializable;

public class Guest implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Identification identification;
    private Car car;
}
