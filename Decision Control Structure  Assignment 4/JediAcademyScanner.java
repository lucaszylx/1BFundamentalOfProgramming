package fundamentalsOfProgramming;
import java.util.Scanner;

public class JediAcademyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter applicant's height (cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter applicant's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter citizenship code ('C' for citizen of Endor, 'N' for non-citizen): ");
        String citizenship = scanner.next();

        System.out.print("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee): ");
        String recommendee = scanner.next();

        String status;

        if (recommendee.equalsIgnoreCase("R")) {
            status = "Accepted";
        } else if (height >= 200 && (age >= 21 && age <= 25) && citizenship.equalsIgnoreCase("C")) {
            status = "Accepted";
        } else {
            status = "Rejected";
        }

        System.out.println("\n--- Application Result ---");
        System.out.println("Status: " + status);

        scanner.close();
    }
}