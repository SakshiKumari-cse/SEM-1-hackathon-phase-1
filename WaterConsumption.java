
import java.util.Scanner;

public class WaterConsumption {

    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== DAILY WATER CONSUMPTION =====");

        System.out.print("Enter morning water usage (in litres): ");
        int morning = sc.nextInt();

        System.out.print("Enter evening water usage (in litres): ");
        int evening = sc.nextInt();

        int total = calculateTotal(morning, evening);

        System.out.println("\n--------- USAGE SUMMARY ---------");
        System.out.println("Morning Usage : " + morning + " Litres");
        System.out.println("Evening Usage : " + evening + " Litres");
        System.out.println("Total Usage   : " + total + " Litres");
        System.out.println("---------------------------------");

        sc.close();
    }
}