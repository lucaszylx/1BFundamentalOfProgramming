package fundamentalsOfProgramming;

public class DailyTemperatureTracker {
    public static void main(String[] args) {
        
        
        double[] temperatures = new double[5]; // pagdeclare at pag-instantiate ng 1D array na may pangalang 'temperatures' na kayang humawak ng limang elements.
        
        temperatures[0] = 32.5; // Paglagay ng value na 32.5 sa index 0 (unang araw).
        temperatures[1] = 34.0; // Paglagay ng value na 34.0 sa index 1 (pangalawang araw).
        temperatures[2] = 31.8; // Paglagay ng value na 31.8 sa index 2 (pangatlong araw).
        temperatures[3] = 33.2; // Paglagay ng value na 33.2 sa index 3 (pang-apat na araw).
        temperatures[4] = 35.1; // Paglagay ng value na 35.1 sa index 4 (limang araw).
        
        System.out.println("Temperatures for the five days:"); // Pag-print ng header message sa console.
        for (int i = 0; i < temperatures.length; i++) { // Paggamit ng standard for loop at .length para ikutin ang buong array.
            System.out.println("Araw " + (i + 1) + ": " + temperatures[i]); // Pag-print ng temperature sa bawat index.
        }
        
        temperatures[2] = 32.0; // Pag-update o pagpalit ng value sa index 2 na may 31.8 at magiging 32.0
        
        System.out.println("\nNa-update na temperatura para sa ikatlong araw (index 2): " + temperatures[2]); // Pag-print ng bagong value ng ikatlong araw.
    }
}