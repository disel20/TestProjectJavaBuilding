package Construction;

public class Apartments extends Buildings {
    private int NumberRooms;
    private String NumberOfApartment;
    //private int FloorNumber;
    public static void main(String[] args) {

        Apartments Studio1A = new Apartments(0, "1A", 1);
        Apartments OneBedroom1B = new Apartments(1, "1B", 1);
        Apartments TwoBedroom1C = new Apartments(2, "1C", 1);
        String[] listOfApartmentsOnTheFloor1 = new String[12];
        listOfApartmentsOnTheFloor1[0] = Studio1A.NumberOfApartment;
        listOfApartmentsOnTheFloor1[1] = OneBedroom1B.NumberOfApartment;
        listOfApartmentsOnTheFloor1[5] = TwoBedroom1C.NumberOfApartment;
        System.out.println("Hello!");
        System.out.println("My apartment is: " + Studio1A.NumberOfApartment + " this is " + Studio1A.NumberRooms + " bedroom apartment");
        OneBedroom1B.setNumberRooms(1);
        System.out.println("Apartment " + OneBedroom1B.getNumberOfApartment() + " has " + OneBedroom1B.getNumberRooms() + " room");
        for (int i = 0; i < listOfApartmentsOnTheFloor1.length; i++) {
            if (listOfApartmentsOnTheFloor1[i] != null) {
                System.out.println(listOfApartmentsOnTheFloor1[i]);
            }
            else {
                //System.out.println("Doesn't exist apt");
            }
        }
    }
    private Apartments(int NumberRooms, String NumberOfApartment, int FloorNumber) {
        this.NumberRooms = NumberRooms;
        this.NumberOfApartment = NumberOfApartment;
        this.FloorNumber = FloorNumber;
    }

    private int getNumberRooms() {
        return NumberRooms;
    }

    private void setNumberRooms(int numberRooms) {
        this.NumberRooms = numberRooms;
    }

    private java.lang.String getNumberOfApartment() {
        return NumberOfApartment;
    }

    private void setNumberOfApartment(String numberOfApartment) {
        this.NumberOfApartment = numberOfApartment;
    }
}
