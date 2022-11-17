import java.util.*;

public class Problem1
{
   
    public void run()
    {
        //declare variables for student name, earned mark, letter grade, and keyboard input
        Scanner kb = new Scanner(System.in);
        String studentName;
        double earnedMark;
        char letterGrade;
        letterGrade = 'N';
        
        
        //prompt user to enter their name and numerical mark
        System.out.println("Please enter your first name:");
        studentName = kb.nextLine();
                        
        System.out.println("Please enter your mark (0-100):");
        earnedMark = kb.nextDouble();
        
        
        //if-else statement to determine letter grade from inputted number
        if (earnedMark > 100.0 || earnedMark < 0.0)
        {
            System.out.println("\nThe inputted mark of " + earnedMark + " for student " + studentName + " is not valid. \nNo letter grade is given.");
        }
        else if (earnedMark < 50.0)
        {
            letterGrade = 'F';
        }
        else if (earnedMark < 60.0)
        {
            letterGrade = 'D';
        }
        else if (earnedMark < 70.0)
        {
            letterGrade = 'C';
        }
        else if (earnedMark < 80.0)
        {
            letterGrade = 'B';
        }
        else if (earnedMark <= 100.0)
        {
            letterGrade = 'A';
        }
        else
        {
            System.out.println("\nInvalid Input.");
        }
        
        
        //print out student name, earned mark, and letter grade to the terminal
        System.out.println("\nStudent Name:\t" + studentName);
        System.out.format("Earned Marks:%5.0f%n", earnedMark);
        System.out.println("Letter Grade:\t" + letterGrade);
    }
}
