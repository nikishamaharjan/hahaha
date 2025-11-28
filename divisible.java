import java.util.Scanner;

/**
 * Write a description of class divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisible
{
         public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scan.nextInt();
        
        if (num %5== 0 && num %3== 0)
    
        {
            System.out.println("It is divisible by both 3 and 5");
            
        }
        
        else{
            System.out.println("It is not divisible by 3 and 5");
        }
    }
}