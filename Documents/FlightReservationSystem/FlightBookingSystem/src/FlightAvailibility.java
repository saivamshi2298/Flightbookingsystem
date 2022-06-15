public class FlightAvailibility {
        int flight_no = 1;
        int airlineOfFlight = 5626;
        int capacityOfFlight;
        int totalSeats;
        boolean flightAvailability;
        public int availabilityOfSeat(){
            totalSeats=40;
            int bookedSeats=0;
            System.out.println("Availibility of seats: "+(totalSeats-bookedSeats));
            return 0;
        }

        public void trackFlightNo() {
            System.out.println("Your Flight Number is: "+flight_no);}
}

