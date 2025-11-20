
/**
 * Write a description of class datatype here.
 *
 * @author (Nikisha)
 * @version (v1.0)
 */
public class datatype
{
    int age; // instance variable
    static int qty; // static variable
    public static void main(String[] args){
        
        int n1=22; // local variable
        
        System.out.println(22);
        
        //Implicit Typecasting
        
        float F=n1;
        
        System.out.println(n1);
        
        //Explicit Typecasting
        
        double db= 22.9;
        int itr= (int)db;
        
        System.out.println(itr);
        
        // Finding min, max, size and bytes
        
        
        System.out.println(Byte.MAX_VALUE); // returns max value
        System.out.println(Byte.MIN_VALUE); // returnsmin value
        System.out.println(Byte.SIZE); //returns bits
        System.out.println(Byte.BYTES); // returns bytes
        
        
        
        //Escape Sequence
        
        System.out.println("Hello\nWorld");// new line
        System.out.println("Hamro\tNepal");// tab
        System.out.println("He said \" Hi \""); // Quatation
        
        
        
        System.out.println("Love emoji: "+ "\u2764");
        
        
        
        byte bt = 77;
        System.out.println(bt);
        
        
        short sh = 3000;
        System.out.println(sh);
        
        
        long lg = 99999999L;
        System.out.println(lg);
        
        float fl = 23.88f;
        System.out.println(fl);
        
        boolean check = true ;
        System.out.println(check);
        
        
        char ch = 'A';
        System.out.println(ch);
        
        
        
        
        
        
        
        
        
        
    
        
        
        
    
        
    }
    
    
    
}