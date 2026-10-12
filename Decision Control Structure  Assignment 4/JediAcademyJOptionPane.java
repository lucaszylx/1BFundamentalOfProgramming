package fundamentalsOfProgramming;
import javax.swing.JOptionPane;

public class JediAcademyJOptionPane {
    public static void main(String[] args) {
        String heightStr = JOptionPane.showInputDialog("Enter applicant's height (cm):");
        double height = Double.parseDouble(heightStr);

        String ageStr = JOptionPane.showInputDialog("Enter applicant's age:");
        int age = Integer.parseInt(ageStr);

        String citizenship = JOptionPane.showInputDialog("Enter citizenship code ('C' for citizen of Endor, 'N' for non-citizen):");
        String recommendee = JOptionPane.showInputDialog("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee):");

        String status;

        if (recommendee != null && recommendee.equalsIgnoreCase("R")) {
            status = "Accepted";
        } else if (height >= 200 && (age >= 21 && age <= 25) && citizenship != null && citizenship.equalsIgnoreCase("C")) {
            status = "Accepted";
        } else {
            status = "Rejected";
        }

        JOptionPane.showMessageDialog(null, "--- Application Result ---\nStatus: " + status);
    }
}