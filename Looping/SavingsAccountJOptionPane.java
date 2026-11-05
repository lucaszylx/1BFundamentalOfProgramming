package Looping;
import javax.swing.JOptionPane;

public class SavingsAccountJOptionPane {

	public static void main(String[] args) {
		double balance = 20000.00;

        while (true) {
            String input = JOptionPane.showInputDialog(null, 
                "Current Balance: P" + balance + "\n\nEnter amount (+ deposit, - withdrawal, 0 to exit):", 
                "Savings Account", 
                JOptionPane.QUESTION_MESSAGE);
            
            if (input == null) break; // Exit if user clicks cancel
            double amount = Double.parseDouble(input);

            if (amount == 0) {
                JOptionPane.showMessageDialog(null, "Program terminated. Final Balance: P" + balance, "Account Closed", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else if (amount > 0) {
                balance += amount;
                JOptionPane.showMessageDialog(null, "Deposited: P" + amount + "\nOutstanding Balance: P" + balance, "Deposit Successful", JOptionPane.INFORMATION_MESSAGE);
            } else {
                double withdrawal = Math.abs(amount);
                if (withdrawal > balance) {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!\nAttempted: P" + withdrawal + "\nCurrent Balance: P" + balance, "Transaction Failed", JOptionPane.ERROR_MESSAGE);
                } else {
                    balance -= withdrawal;
                    JOptionPane.showMessageDialog(null, "Withdrew: P" + withdrawal + "\nOutstanding Balance: P" + balance, "Withdrawal Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

	}

}
