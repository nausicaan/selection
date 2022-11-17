import java.util.*;

public class Problem2
{
    public void run()
    {
        //declare variables for account name, type, number, balance, label, and interest earned
        //declare and initialise variables for the rates paid in interest
        Scanner kb = new Scanner(System.in);
        String accountName;
        String accountType;
        char accountLabel;
        int accountNumber;
        double accountBalance;        
        double interest;
        final double CHEQ_RATE = 0.005;
        final double SAV_RATE = 0.0125;
        final double GIC_RATE = 0.0085;
        final double TFSA_RATE = 0.0075;
        
        
        //gather information regarding account name, number, balance, and type
        System.out.println("Please enter your account name:");
        accountName = kb.nextLine();
        
        System.out.println("Please enter your account number:");
        accountNumber = kb.nextInt();
        
        System.out.println("Please enter your account balance:");
        accountBalance = kb.nextDouble();
        
        System.out.println("Please enter your account type: \n(C for Chequing, S for Savings, G for GIC, or T for TFSA)");
        accountType = kb.next();
        accountLabel = accountType.toUpperCase().charAt(0);
        
        
        //switch statement to determine account label and type from inputted string
        switch (accountLabel)
        {
            case 'C':
                interest = accountBalance * CHEQ_RATE;
                accountType = "Chequing";
                break;
            
            case 'S':
                interest = accountBalance * SAV_RATE;
                accountType = "Savings";
                break;
                
            case 'G':
                interest = accountBalance * GIC_RATE;
                accountType = "GIC";
                break;
                
            case 'T':
                interest = accountBalance * TFSA_RATE;
                accountType = "TFSA";
                break;
                
            default:
                System.out.println("Invalid input");
                interest = 0.0;
        }
        
        //print out account name, number, balance, type and interest to the terminal
        System.out.println("Account Name:\t\t" + accountName);
        System.out.println("Account Number:\t\t" + accountNumber);
        System.out.format("Account Balance:\t$ %(,5.2f%n", accountBalance);
        System.out.println("Account Type:\t\t" + accountType);
        
        System.out.format("%nInterest Ammount:\t$ %(,5.2f%n", interest);
    }
}
