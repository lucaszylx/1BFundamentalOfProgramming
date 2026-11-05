package Looping;
import javax.swing.JOptionPane;

public class EvenNumbersJOptionPane {

	public static void main(String[] args) {
		StringBuilder output = new StringBuilder("Even numbers from 2 to 100:\n\n");
        
        for (int i = 2; i <= 100; i += 2) {
            output.append(i).append(", ");
            
            if (i % 20 == 0) {
                output.append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Even Numbers (2-100)", JOptionPane.INFORMATION_MESSAGE);
    }

}
