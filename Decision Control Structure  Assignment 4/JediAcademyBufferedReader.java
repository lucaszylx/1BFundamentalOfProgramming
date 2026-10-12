package fundamentalsOfProgramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JediAcademyBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter applicant's height (cm): ");
        double height = Double.parseDouble(reader.readLine());

        System.out.print("Enter applicant's age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.print("Enter citizenship code ('C' for citizen of Endor, 'N' for non-citizen): ");
        String citizenship = reader.readLine().trim();

        System.out.print("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee): ");
        String recommendee = reader.readLine().trim();

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
    }
}