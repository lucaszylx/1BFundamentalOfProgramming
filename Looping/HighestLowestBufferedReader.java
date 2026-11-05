package Looping;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HighestLowestBufferedReader {

	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        System.out.println("Enter 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            int num = Integer.parseInt(reader.readLine());
            
            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }

        System.out.println("\n--- RESULTS ---");
        System.out.println("Highest Number: " + highest);
        System.out.println("Lowest Number: " + lowest);
		

	}

}
