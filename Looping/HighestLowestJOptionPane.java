package Looping;
import javax.swing.JOptionPane;	

public class HighestLowestJOptionPane {

	public static void main(String[] args) {
		int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter number " + i + " of 10:", "Input Number", JOptionPane.QUESTION_MESSAGE);
            if (input == null) return; // Exit if user cancels
            
            int num = Integer.parseInt(input);
            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }

        String result = "Highest Number: " + highest + "\nLowest Number: " + lowest;
        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
	}

}
