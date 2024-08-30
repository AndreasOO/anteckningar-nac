import javax.swing.*;
import java.util.Calendar;

public class GymTicketCalculator {
    private String mostBeneficialTicketType;
    private double priceForYearlyTicket;
    private double priceForSingleTicket;


    GymTicketCalculator() {

    }


    public void execute() {
        getUserInput();
        calculateMostBeneficialTicketType();
        outputSuggestionToUser();

    }

    private void getUserInput() {
        priceForSingleTicket = Double.parseDouble(JOptionPane.showInputDialog("Ange pris for styckbiljett"));
        priceForYearlyTicket = Double.parseDouble(JOptionPane.showInputDialog("Ange pris for årsbiljett"));
    }


    private void calculateMostBeneficialTicketType() {
        int daysOfYear = isLeapYear(Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) ? 366 : 365;
        System.out.println(priceForSingleTicket*daysOfYear);
        // in case of equal value between yearly and singles, choose yearly due to hassle of singles :)
        mostBeneficialTicketType = priceForSingleTicket*daysOfYear > priceForYearlyTicket ? "årsbiljett" : "styckbiljett";
    }

    private boolean isLeapYear(int currentYear) {
        return currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0;
    }

    private void outputSuggestionToUser() {
        JOptionPane.showMessageDialog(null, mostBeneficialTicketType);
    }
}
