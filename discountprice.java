import java.util.Scanner;

/**
 * Write a description of class discountprice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class discountprice
{
   public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Marked Price");
    

        float mp, sp;     // marked price and selling price
        char category;    // item category

        // Input marked price
        System.out.print("Enter the mp of the item: ");
        mp = scan.nextFloat();

        // Input category
        System.out.print("Enter the category of the item (A/B/C/D): ");
        category = scan.next().charAt(0);

        // For discount
        if (category == 'A' ) {
            sp = mp - (mp * 0.60f);
        } else if (category == 'B' ) {
            sp = mp - (mp * 0.40f);
        } else if (category == 'C' ) {
            sp = mp - (mp * 0.20f);
        } else if (category == 'D' ) {
            sp = mp - (mp * 0.10f);
        } else {
            System.out.println("Invalid category!");
            scan.close();
            return;
        }

        // Display selling price
        System.out.println("Selling Price of the item = " + sp);

        scan.close();
    }
}

        
    


    
