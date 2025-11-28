import java.util.Scanner;

/**
 * Write a description of class Gpa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gpa
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double GPA;
        
        System.out.println("Enter the GPA ");
         GPA = scan.nextDouble();
        char Grade;
        
        if (GPA < 0.0 && GPA >4.0){
            System.out.println("Invalid GPA: Please enter a valid GPA");
        }
        
        if (GPA >=3.6 && GPA <=4.0){
        Grade ='A';
        }
        
        else if (GPA >=3.0 && GPA <=3.5){
        Grade = 'B';}
        
        else if (GPA >=2.0 && GPA <= 2.5){
        Grade = 'C';}
        else if (GPA >=1.0 && GPA <= 1.5){
        Grade = 'D';}
        else if (GPA <=1.0 ){
        Grade ='E';}
        else {
        Grade ='F';}
        
        System.out.println("Grade: " + Grade);
    }
        
        
        
        
}
