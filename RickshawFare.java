import java.util.Scanner;

/**
 * Write a description of class Rickshawfare here.
 *
 * @author (Nikisha)
 * @version (v1.0)
 */


public class RickshawFare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Rules
         double Basefare= 25;          // Rs. 25 Basefare
         double  perKm= 5;             // Rs. 5 per km
        double perMin = 2;             // Rs.2 per minute
        double localDiscount = 0.10;   // 10% discount for locals on long distance
        double nightcharge = 0.20;  // 20% extra charge at night 

        // Input 
        System.out.print("Enter distance (in km): ");
        double distance = scan.nextDouble();

        System.out.print("Enter time (in minutes): ");
        double time = scan.nextDouble();

        System.out.print("Is the customer local? (yes/no): ");
        boolean isLocal = scan.next().equals("yes");

        System.out.print("Is this a long distance trip? (yes/no): ");
        boolean isLongDistance = scan.next().equals("yes");

        System.out.print("Is the travel during night? (yes/no): ");
        boolean isNight = scan.next().equals("yes");

        // Totalfare 
        double Totalfare = Basefare + (distance * perKm) + (time * perMin);

        //  local discount if travelling for long distance
        

        if (isLocal && isLongDistance) {
            Totalfare = Totalfare - (Basefare * localDiscount);
        }

        //  extra charge for night
        if (isNight) {
            Totalfare = Totalfare + (Basefare * nightcharge);
        }

        // Final Output
        System.out.println("Final Fare: Rs. " + Totalfare);

        
    }
}

    
