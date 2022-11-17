import java.util.*;

public class Problem3
{
    public void run()
    {
        //declare variables
        Scanner kb = new Scanner(System.in);
        String section;
        String type;
        char customer;
        char seat;
        double ageDiscount;
        double seatPrice;
        double regularPrice;
        double totalPrice;
        
        
        //prompt user for regular ticket price, seat section, and customer type
        System.out.println("Please enter the regular price:");
        regularPrice = kb.nextDouble();
        
        System.out.println("Please enter your seat section:\n(U for Upper, M for Middle, or L for Lower)");
        section = kb.next();
        seat = section.toUpperCase().charAt(0);
                        
        System.out.println("Please enter your customer type:\n(A for Adult or S for Senior)");
        type = kb.next();
        customer = type.toUpperCase().charAt(0);
        
        
        //switch statement to apply discount or premium based on seat section
        switch (seat)
        {
            case 'U':
                seatPrice = regularPrice - (regularPrice * 0.30);
                section = "Upper";
                break;
                
            case 'L':
                seatPrice = regularPrice + (regularPrice * 0.25);
                section = "Lower";
                break;
                
            case 'M':
                seatPrice = regularPrice;
                section = "Middle";
                break;
                
            default:
                seatPrice = regularPrice;
                System.out.println("Invalid Input\n\n");
        }
        
        
        //switch statement to determine if senior discount is applicable
        switch (customer)
        {
            case 'S':
                ageDiscount = seatPrice * 0.10;
                type = "Senior";
                break;
                
            default:
                ageDiscount = 0.0;
                type = "Adult";
        }
        
        
        //print out regular ticket price, seat section, customer type, and total price to the terminal
        totalPrice = seatPrice - ageDiscount;
        System.out.format("%nRegular Price:\t\t$ %5.2f%n", regularPrice);
        System.out.println("Seat Location:\t\t" + section);
        System.out.println("Customer Type:\t\t" + type);
        System.out.format("%nTicket Price:\t\t$ %5.2f", totalPrice);    
    }
}
