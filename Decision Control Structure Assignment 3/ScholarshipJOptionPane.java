package fundamentalsOfProgramming;
import javax.swing.JOptionPane;

public class ScholarshipJOptionPane {
    public static void main(String[] args) {
        String nsatInput = JOptionPane.showInputDialog("Enter NSAT Score:");
        double nsatScore = Double.parseDouble(nsatInput);

        String salaryInput = JOptionPane.showInputDialog("Enter Parents' Monthly Salary:");
        double salary = Double.parseDouble(salaryInput);

        String examInput = JOptionPane.showInputDialog("Enter Entrance Exam Score:");
        double entranceExam = Double.parseDouble(examInput);

        double average = (nsatScore + entranceExam) / 2.0;
        String status;

        if (salary > 10000 || nsatScore < 90 || entranceExam < 85) {
            status = "Rejected";
        } else if (salary <= 3500 && average >= 91) {
            status = "Accepted";
        } else {
            status = "Subjected for Further Study";
        }

        String message = String.format(
            "--- Application Result ---\nAverage Score: %.2f\nStatus: %s",
            average, status
        );

        JOptionPane.showMessageDialog(null, message);
    }
}