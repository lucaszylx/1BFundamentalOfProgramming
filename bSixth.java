package fundamentalsOfProgramming;
import javax.swing.JOptionPane; //Imports JOptionPane class to access standard dialog boxes for user input/output 

public class bSixth{
	
    public static void main( String[] args ){
        String name = ""; // Declares a String variable named "name" and sets it as an empty string
        name = JOptionPane.showInputDialog("Please enter your name"); //Displays an input dialog to collect data from the user.

        String msg = "Hello " + name + "!"; //Combines text literals and the variable "name" into a single String stored in "msg"
        JOptionPane.showMessageDialog(null, msg); //Displays an output dialog containing the greeting message created in "msg" variable
    }
}

/* Sir, pardon for using comments as a way to describe my code, I am currently sick and because of coughing and runny nose, 
hindi po ako makapagsalita ng maayos, I always end up coughing and hurting my throat. Thankyou for Understanding sir. */