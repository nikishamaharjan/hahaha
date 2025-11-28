
/**
 * Write a description of class Tutorial4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial4
{
   public static void main(String[] args)
{
    int age; // declaration statement
    age= 18; // expression statement
    
    System.out.println("Welcome to the Mart!");
    
    if (age>=18){
    
    System.out.println("You are eligible for citizenship,");
}
    
else
{
    System.out.println("You are not eligible for citizenship");
}
    
 System.out.println("Thankyou :Happy customer");
 
 
 int num= 20;
 if(num > 0)
 {
     System.out.println("This number is positive.");
 }
 
 else if (num== 0){
     System.out.println("This number is Zero");
 }
 
 else
 {
     System.out.println("This number is negative");
 }
 
 
 
 
 int num = 15;
 if (num % 3 == 0)
 {
     if(num % 5 ==0)
     {
         System.out.println("Divisible by both 3 and 5");
     }
     
     else
     {
         System.out.println("Divisible by 3 but not by 5");
         
     }
    }
     
     else
     {
         System.out.println("Not divisible by both 3 and 5.");
     }
 
 
 int choice = 1; // {1, 2, 3}
 switch(choice){
     
     //case
     case 1: System.out.println("Drink: Pepsi");break;
     case 2: System.out.println("Drink: Sprite"); break;
     case 3: System.out.println("Drink: Fanta"); break;
     default: System.out.println("Not a valid choice");
 }

}   
    
}