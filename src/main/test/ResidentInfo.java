package main.test;

public class ResidentInfo {

    private static int residentInfoCount = 1;

    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public ResidentInfo(String firstName, String lastName, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public static ResidentInfo buildResidentInfo() {
        String firstName = String.format("firstName_%d", residentInfoCount);
        String lastName = String.format("lastName_%d", residentInfoCount);
        String phone = String.format("phone_%d", residentInfoCount);
        String address = String.format("address_%d", residentInfoCount);
        residentInfoCount++;
        return new ResidentInfo(firstName, lastName, phone, address);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ResidentInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
