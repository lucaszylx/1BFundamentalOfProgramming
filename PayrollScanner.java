package conditionals;
import java.util.Scanner;

public class PayrollScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        double grossPay = hourlyRate * hoursWorked;
        double taxRate = getTaxRate(grossPay);
        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.println("\n--- Payroll Summary ---");
        System.out.printf("Gross Pay: Php %.2f\n", grossPay);
        System.out.printf("Withholding Tax (%.0f%%): Php %.2f\n", taxRate * 100, withholdingTax);
        System.out.printf("Net Pay: Php %.2f\n", netPay);

        scanner.close();
    }

    public static double getTaxRate(double grossPay) {
        if (grossPay <= 2000.00) {
            return 0.10;
        } else if (grossPay <= 4000.00) {
            return 0.12;
        } else if (grossPay <= 10000.00) {
            return 0.15;
        } else {
            return 0.20;
        }
    }
}