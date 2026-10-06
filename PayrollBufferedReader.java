package conditionals;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PayrollBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = Double.parseDouble(reader.readLine());

        System.out.print("Enter hours worked: ");
        double hoursWorked = Double.parseDouble(reader.readLine());

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

        System.out.println("\n--- Payroll Summary ---");
        System.out.printf("Gross Pay: Php %.2f\n", grossPay);
        System.out.printf("Withholding Tax (%.0f%%): Php %.2f\n", taxRate * 100, withholdingTax);
        System.out.printf("Net Pay: Php %.2f\n", netPay);
    }
}