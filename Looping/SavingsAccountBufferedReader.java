package Looping;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SavingsAccountBufferedReader {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double balance = 20000.00;
        
        System.out.println("Mucho Dinero Savings Account Initial Balance: P" + balance);
        System.out.println("Enter numbers (+ deposit, - withdrawal, 0 to exit):");

        while (true) {
            System.out.print("Enter amount: ");
            double amount = Double.parseDouble(reader.readLine());

            if (amount == 0) {
                System.out.println("Program terminated. Final Balance: P" + balance);
                break;
            } else if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: P" + amount + " | Outstanding Balance: P" + balance);
            } else {
                double withdrawal = Math.abs(amount);
                if (withdrawal > balance) {
                    System.out.println("INSUFFICIENT FUNDS! Attempted: P" + withdrawal + " | Current Balance: P" + balance);
                } else {
                    balance -= withdrawal;
                    System.out.println("Withdrew: P" + withdrawal + " | Outstanding Balance: P" + balance);
                }
            }
        }
	}
}
