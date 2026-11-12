package fundamentalsOfProgramming;
import java.util.Arrays;

public class CinemaSeatingChart {
    public static void main(String[] args) {
        
        String[][] seats = { // Pagdedeklara at pag-initialize ng 2D String array na may pangalang 'seats'.
            {"Alice", "Bob", "Charlie"}, // Unang row (Row 1) na may mga elements na Alice, Bob, at Charlie.
            {"David", "Emma", "Frank"}   // Pangalawang row (Row 2) na may mga elements na David, Emma, at Frank.
        };
        
        System.out.println("Sitting in the second row, third column: " + seats[1][2]); // Pag-access gamit ang index [1][2] para kay Frank at pag-print sa console.
        
        seats[0][1] = "Vacant"; // Pag-update o pagpalit ng "Bob" (na nasa row 0, column 1) at magiging "Vacant"
        
        System.out.println("Complete seating arrangement: " + Arrays.deepToString(seats)); // Paggamit ng Arrays.deepToString() para i-print ang buong 2D array sa isang line.
    }
}