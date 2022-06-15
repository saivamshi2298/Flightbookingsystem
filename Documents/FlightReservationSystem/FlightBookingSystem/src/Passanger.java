import java.util.Scanner;

public class Passanger{
    String name;
    String contact;
    String email;
    String address;
    Passanger() {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name= s.nextLine();
        System.out.println();
        System.out.print("Enter your Mobile Number: ");
        contact = s.nextLine();
        System.out.println();
        System.out.print("Enter your Email Id: ");
        email = s.nextLine();
        System.out.println();
        System.out.print("Enter your Full Address: ");
        address = s.nextLine();
        System.out.println();
    }
}
