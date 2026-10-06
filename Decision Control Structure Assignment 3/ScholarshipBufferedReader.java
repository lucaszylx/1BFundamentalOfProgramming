package fundamentalsOfProgramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScholarshipBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT Score: ");
        double nsatScore = Double.parseDouble(reader.readLine());

        System.out.print("Enter Parents' Monthly Salary: ");
        double salary = Double.parseDouble(reader.readLine());

        System.out.print("Enter Entrance Exam Score: ");
        double entranceExam = Double.parseDouble(reader.readLine());

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
    }
}