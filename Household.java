import java.util.Scanner;

public class Household {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int familyMembers = scanner.nextInt();
        double waterConsumed = scanner.nextDouble();
        int houseNumber = scanner.nextInt();
        char usageStatus = scanner.next().charAt(0);

        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " L");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Usage Status: " + usageStatus);

        scanner.close();
    }
}