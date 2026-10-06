package fundamentalsOfProgramming;
import java.util.Scanner;

public class ScholarshipScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter NSAT Score: ");
        double nsatScore = scanner.nextDouble();

        System.out.print("Enter Parents' Monthly Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Entrance Exam Score: ");
        double entranceExam = scanner.nextDouble();

        double average = (nsatScore + entranceExam) / 2.0;
        String status;

        if (salary > 10000 || nsatScore < 90 || entranceExam < 85) {
            status = "Rejected";
        } else if (salary <= 3500 && average >= 91) {
            status = "Accepted";
        } else {
            status = "Subjected for Further Study";
        }

        System.out.println("\n--- Application Result ---");
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Status: " + status);

        scanner.close();
    }
}