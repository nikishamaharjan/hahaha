import java.util.Scanner;

/**
 * Write a description of class MpSp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MpSp
{
    public static void main(String[] args) {

        float mp, sp, discount = 0;
        char category;

        Scanner scan = new Scanner(System.in);

        // Input marked price
        System.out.print("Enter the marked price of the item: ");
        mp = scan.nextFloat();

        // Input category
        System.out.print("Enter the category of the item (A/B/C/D): ");
        category = scan.next().charAt(0);

        switch (Character.toUpperCase(category)) {
            case 'A':
                discount = 0.60f;
                break;

            case 'B':
                discount = 0.40f;
                break;

            case 'C':
                discount = 0.20f;
                break;

            case 'D':
                discount = 0.10f;
                break;

            default:
                System.out.println("Invalid category!");
                return;
        }

        // Calculate selling price
        sp = mp - (mp * discount);

        // Display result
        System.out.println("Selling Price = " + sp);
    }
}

