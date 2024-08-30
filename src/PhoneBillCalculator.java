import javax.swing.*;
import java.util.Locale;

public class PhoneBillCalculator {
    private final double MINUTES_REQUIRED_FOR_REBATE = 1000.0;
    private final double REBATE_IN_DECIMAL = 0.90;
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

        costPerMonth = rebateIsApplied() ? calculateWithRebate() : calculateWithoutRebate();
    }

        private boolean rebateIsApplied() {
            return averageMinutesCalledPerMonth >= MINUTES_REQUIRED_FOR_REBATE;
        }

        private double calculateWithRebate() {
            return (averageMinutesCalledPerMonth * pricePerMinuteCalled)*REBATE_IN_DECIMAL;
        }

        private double calculateWithoutRebate() {
            return averageMinutesCalledPerMonth * pricePerMinuteCalled;
        }

    private void showOutPutToUser() {
        String output = formatToLocaleStandard();
        JOptionPane.showMessageDialog(null, output + " kostnad per minut");
    }

    private String formatToLocaleStandard() {
        return String.format(Locale.of("sv", "SE"), "%.2f", costPerMonth);
    }
}
