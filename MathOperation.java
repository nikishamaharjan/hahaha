import java.util.Scanner;

/**
 * Write a description of class MathOperation here.
 *
 * @author (Nikisha)
 * @version (v1.0)
 */
public class MathOperation
{
   public static void main(String[] args){
       
       //Arthimetic 
    int a=4;
    int b=13;
    int c=a+b;
    int d=a/b;
    int e=a*b;
    int f=a-b;
    
    
    
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    
    
    //Unary(Post and pre increment
    
    int h=4;
    
    System.out.println(h);
    System.out.println(++h);
    
    
    System.out.println(h);
    System.out.println(h++);
    
    
    System.out.println(h);
    
    //Relational
    
    int i= 9;

    int j= 7;
    
    
    System.out.println(i == j);//false
    System.out.println(i != j);
    System.out.println(i > j);
    System.out.println(i < j);
    System.out.println(i <= j);
    System.out.println(i >= j);
    
    //Assignment
    
    int t=6;
    int y=7;
    int m=t+y;
    
    
    //Ternary 
    
    int age= 16;
    String isvalid=(age>16)?"Driving is allowed":"Driving is not allowed";
    System.out.println(isvalid);
    
    //Logical
    
    int p=13;
    int q=15;
    int r=19;
    
    if(p>q && r>p)
    System.out.println("p is greatest number");
    else if(r>p || r>q)
    System.out.println("r is greatest number");
    
    
    //grade
    
    Scanner scan= new Scanner(System.in);
        System.out.println("enter grade");
        int grade=scan.nextInt();
        String isValid=(grade>=40)? "Pass":"Fail";
        
        System.out.println(isValid);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


       
       
       
       
   }
    
    
}