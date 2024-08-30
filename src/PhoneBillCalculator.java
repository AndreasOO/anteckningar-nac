import javax.swing.*;
import java.util.Locale;

public class PhoneBillCalculator {
    private double averageMinutesCalledPerMonth;
    private double pricePerMinuteCalled;
    private double costPerMonth;


    PhoneBillCalculator() {

    }

    public void execute() {
        getUserInput();
        calculateCostPerMonth();
        showOutPutToUser();
    }

    private void getUserInput() {
        averageMinutesCalledPerMonth = Double.parseDouble(JOptionPane.showInputDialog("Ange antal ringda minuter per månad: "));
        pricePerMinuteCalled = Double.parseDouble(JOptionPane.showInputDialog("Ange kostnad per minut: "));
    }

    private void calculateCostPerMonth() {
        costPerMonth = averageMinutesCalledPerMonth * pricePerMinuteCalled;
    }
    private void showOutPutToUser() {
        String output = formatToLocaleStandard();
        JOptionPane.showMessageDialog(null, output + " kostnad per minut");
    }

    private String formatToLocaleStandard() {
        return String.format(Locale.of("sv", "SE"), "%.2f", costPerMonth);
    }
}
