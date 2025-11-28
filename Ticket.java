import java.util.Scanner;

/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);

    System.out.print("What is your your age group  ");
    String ageGroup = scan.next();

    System.out.print("Enter movie language  ");
    String language = scan.next();

    System.out.print("Are you a student?  ");
    String isStudent = scan.next();

    System.out.print("Is it a festival day?  ");
    String isFestival = scan.next();

    double basePrice = 0;

    
    if(ageGroup.equals("child"))
        basePrice = 150;
    else if(ageGroup.equals("adult"))
        basePrice = 250;
    else if(ageGroup.equals("senior"))
        basePrice = 200;
    else {
        System.out.println("Invalid age group!");
        return;
    }

    
    if(language.equals("hindi"))
        basePrice += 50;
    else if(language.equals("english"))
        basePrice += 100;
    else if(!language.equals("nepali")) {
        System.out.println("Invalid movie language!");
        return;
    }

    double finalPrice = basePrice;

    
    if(isStudent.equals("yes"))
        finalPrice -= finalPrice * 0.20;  

    
    if(isFestival.equals("yes"))
        finalPrice -= finalPrice * 0.15;  

    // Final output
    System.out.println("Base Price: Rs. " + basePrice);
    System.out.println("Final Ticket Price: Rs. " + finalPrice);
}

}