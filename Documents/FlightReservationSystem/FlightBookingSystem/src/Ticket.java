import java.util.Scanner;

public class Ticket extends RegularTicket{
    int pnrNo;
    String departure;
    String destination;
    int date;
    int time;
    int noOfTickets;
    boolean status;
    int duration;
    boolean cancel;
    Ticket(){
        pnrNo=1;
        departure="Mumbai";
        destination="Delhi";
        noOfTickets=5;
        status=true;
        duration=5;
        cancel=false;
    }
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        Passanger p = new Passanger();
        FlightAvailibility f= new FlightAvailibility();
        f.availabilityOfSeat();
        f.trackFlightNo();
        int choice;
        Ticket t = new Ticket();
        System.out.println("For regular tickets Press 1");
        System.out.println("For tourist tickets Press 2");
        choice= b.nextInt();
        if(choice==1){
            RegularTicket r = new RegularTicket();
            System.out.println("//////////////////////////////Bill//////////////////////////////");
            System.out.print("Name :"+p.name);
            System.out.println();
            System.out.print("Contact: "+p.contact);
            System.out.println();
            System.out.print("Email Id: "+p.email);
            System.out.println();
            System.out.print("Address: "+p.address);
            System.out.println();
            System.out.println("You have selected Regular Ticket");
            System.out.print("Flight Number: "+ f.flight_no);
            System.out.println();
            System.out.print("Airline of Flight: "+f.airlineOfFlight);
            System.out.println();
            System.out.println("//////////////////////////////Bill//////////////////////////////");

        }
        else{
            t.NoOFLocation();
            t.addRemoveLocation();
            System.out.println("////////////////////////////////////////////////////////////////");
            System.out.print("Name :"+p.name);
            System.out.println();
            System.out.print("Contact: "+p.contact);
            System.out.println();
            System.out.print("Email Id: "+p.email);
            System.out.println();
            System.out.print("Address: "+p.address);
            System.out.println();
            System.out.println("You have selected Tourist Ticket");
            System.out.print("Flight Number: "+ f.flight_no);
            System.out.println();
            System.out.print("Airline of Flight: "+f.airlineOfFlight);
            System.out.println();
            System.out.println("Hotel Address: "+ t.hotelAddress);
            t.printLocation();
            System.out.println("////////////////////////////////////////////////////////////////");
        }


    }
}
