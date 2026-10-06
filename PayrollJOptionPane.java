package conditionals;
import javax.swing.JOptionPane;

public class PayrollJOptionPane {
    public static void main(String[] args) {
        String rateInput = JOptionPane.showInputDialog("Enter hourly pay rate:");
        double hourlyRate = Double.parseDouble(rateInput);

        String hoursInput = JOptionPane.showInputDialog("Enter hours worked:");
        double hoursWorked = Double.parseDouble(hoursInput);

        double grossPay = hourlyRate * hoursWorked;
        double taxRate;

        if (grossPay <= 2000.00) {
            taxRate = 0.10;
        } else if (grossPay <= 4000.00) {
            taxRate = 0.12;
        } else if (grossPay <= 10000.00) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        String message = String.format(
            "--- Payroll Summary ---\nGross Pay: Php %.2f\nWithholding Tax (%.0f%%): Php %.2f\nNet Pay: Php %.2f",
            grossPay, taxRate * 100, withholdingTax, netPay
        );

        JOptionPane.showMessageDialog(null, message);
    }
}