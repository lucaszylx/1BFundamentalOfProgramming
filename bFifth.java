package fundamentalsOfProgramming;

import java.util.Scanner; // Imports Scanner class to get input from the keyboard
import java.util.InputMismatchException; // Import the specific exception

public class bFifth {

    public static void main(String[] args) {
        String name; // Declares a String variable named "name" to store text input
        int age; // Declares an integer variable named "age" to store numerical input
        Scanner inputDevice = new Scanner(System.in); // Creates a Scanner object named "inputDevice" to read user input

        try {
            System.out.print("Please enter your name: "); // Prints prompt asking user to enter their name
            name = inputDevice.nextLine(); // Reads the user's name input as a String and stores it in "name"

            System.out.print("Please enter your age: "); // Prints prompt asking user to enter their age
            // If the user types text instead of a number, it throws an error here
            age = inputDevice.nextInt(); // Reads the user's age input as an integer and stores it in "age"

            // This only prints if the age was entered correctly
            System.out.println("Your name is " + name + " and you are " + age + " years old."); // Concatenates string literals and variables to display the output
        
        } catch (InputMismatchException e) {
            // Catches the crash and displays a friendly error message instead
            System.out.println("Error: Age must be a whole number."); // Prints error message when user inputs non-integer data
        
        } finally {
            // Always runs, ensuring the scanner is closed to prevent memory leaks
            inputDevice.close(); // Closes the Scanner object to release system resources
        }
    }
}

/* Sir, pardon for using comments as a way to describe my code, I am currently sick and because of coughing and runny nose, 
hindi po ako makapagsalita ng maayos, I always end up coughing and hurting my throat. Thankyou for Understanding sir. */