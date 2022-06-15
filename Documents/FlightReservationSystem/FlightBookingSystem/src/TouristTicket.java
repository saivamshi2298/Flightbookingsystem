import java.util.Scanner;

public class TouristTicket {
    String hotelAddress = "delhi";

    Scanner a = new Scanner(System.in);
    int no;
    public void NoOFLocation(){
        System.out.println("Enter number of locations: ");
        no=a.nextInt();
    }


    String[] touristLocation = new String[no];

    public void addRemoveLocation(){
        for(int i =1; i<=no; i++) {
            System.out.println("Enter Locations name number "+ i);
            touristLocation[i] = a.next();
        }

    }
    public void printLocation(){
        System.out.println("Locations: ");
        for(String s: touristLocation){
            System.out.print(s+" ");
        }
    }
}
