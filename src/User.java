import java.util.Scanner;

class User extends TravelBookingSystem{
    Scanner sc =new Scanner(System.in);
    double total = 0;

    protected String username, password;
    Transport[] bookedTickets = new Transport[100];
    int bookedTicketCount = 0;
    int noOfTickets = 0;

    double amount;

    Hotel h;
    boolean hotelBooked;
    String hotelName;
    String stayType;
    int stayCountOfDays;
    int stayCountOfNights;
    double hotelAmount;

    User(String u, String p) {
        username = u;
        password = p;
    }

}