import java.util.Scanner;

/**
 * Write a description of class determinenum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class determinenum
{
    
    
         public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scan.nextInt();
        
        if (num >0){
            System.out.println("Positive");
            
        }
        
        else if (num <0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}