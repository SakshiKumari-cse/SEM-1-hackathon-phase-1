
import java.util.Scanner;

public class Waterbill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== HOUSEHOLD WATER BILL =====");

        System.out.print("Enter household water usage (in litres): ");
        int litres = input.nextInt();

        int amount;

        if (litres <= 500) {
            amount = 100;
        } else {
            amount = 200;
        }

        System.out.println("\n--------- BILL DETAILS ---------");
        System.out.println("Water Consumption : " + litres + " Litres");
        System.out.println("Total Water Bill  : Rs." + amount);
        System.out.println("--------------------------------");

        input.close();
    }
}