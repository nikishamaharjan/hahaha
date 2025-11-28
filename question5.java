import java.util.Scanner;

/**
 * Write a description of class question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question5
{
    
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scan.nextInt();
        if(num %5== 0 )
        { 
            if(num %3== 0)
            {System.out.println("It is divisible by both 5 and 3");}
            
            else{
                System.out.println("It is divisible by 5 but not by 3");
            }}
            
            else {
                if(num %3== 0){
                System.out.println("It is divisible by 3 but not by 5");
            }
                else{
                    System.out.println("It is not divisble by both 3 and 5");
                }
            }}
                
            }
        
        
