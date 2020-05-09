public class Apartments extends Buildings {
    private int NumberRooms;
    private String NumberOfApartment;
    public static void main(String[] args) {
        String Name = "Apts";
        //int NumberRooms;

        Apartments Studio = new Apartments(0, "1A");
        System.out.println("Hello!");
        System.out.println("My apartment is: " + Studio.NumberOfApartment + " this is " + Studio.NumberRooms + " bedroom apartment");
    }
    private Apartments(int NumberRooms, String NumberOfApartment) {
        this.NumberRooms = NumberRooms;
        this.NumberOfApartment = NumberOfApartment;
    }
}
