import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

public class WindowCostCalculator {
    private double REQUIRED_COST_FOR_FIVE_PERCENT_REBATE = 1500.0;
    private double REQUIRED_COST_FOR_TEN_PERCENT_REBATE = 2500.0;
    private double REQUIRED_COST_FOR_25_PERCENT_REBATE = 5000.0;

    private double widthInMeters;
    private double heightInMeters;
    private double pricePerSquareMeter;
    private double totalCostInitial;
    private double totalCostAfterRebate;
    private int appliedRebatePercentage;
    private String outputToUser;

    WindowCostCalculator() {

    }

    public void execute() {
        getUserInput();
        calculateTotalCost();
        calculateRebatePercentage();
        applyRebate();
        applyRounding();
        formatOutput();
        showOutputToUser();
    }

    private void getUserInput() {
        try {
            getWindowWidthFromUser();
            getWindowHeightFromUser();
            getPricePerSquareMeterFromUser();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Oväntat invärde. Programmet körs om.");
            restartProgram();
        }
    }
    private void getWindowWidthFromUser() {
        widthInMeters = Double.parseDouble(JOptionPane.showInputDialog("Ange fönstrets bredd: ").trim().replace(",","."));
    }
    private void getWindowHeightFromUser() {
        heightInMeters = Double.parseDouble(JOptionPane.showInputDialog("Ange fönstrets bredd: ").trim().replace(",","."));
    }
    private void getPricePerSquareMeterFromUser() {
        pricePerSquareMeter = Double.parseDouble(JOptionPane.showInputDialog("Ange Pris per kvadratmeter: ").trim().replace(",","."));
    }
    private void restartProgram() {
        execute();
    }



    private void calculateTotalCost() {
        totalCostInitial = widthInMeters*heightInMeters*pricePerSquareMeter;
    }

    private void calculateRebatePercentage() {
        if (totalCostInitial >= REQUIRED_COST_FOR_25_PERCENT_REBATE) {
            appliedRebatePercentage = 25;
        }
        else if (totalCostInitial >= REQUIRED_COST_FOR_TEN_PERCENT_REBATE) {
            appliedRebatePercentage = 10;
        }
        else if (totalCostInitial >= REQUIRED_COST_FOR_FIVE_PERCENT_REBATE) {
            appliedRebatePercentage = 5;
        }
        else {
            appliedRebatePercentage = 0;
        }
    }


    private void applyRebate() {
        totalCostAfterRebate =  totalCostInitial * (100.0-appliedRebatePercentage)/100.0;
    }

    private void applyRounding() {
        totalCostAfterRebate = BigDecimal.valueOf(totalCostAfterRebate).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private void formatOutput() {
        //could be optimized by calculating total length of all values and expected text, then add as param to sb.
         StringBuilder sb = new StringBuilder();
       sb.append(String.format(Locale.of("sv", "SE"),"Bredd: %.2f meter\n", widthInMeters));
       sb.append(String.format(Locale.of("sv", "SE"),"Bredd: %.2f meter\n", heightInMeters));
       sb.append(String.format(Locale.of("sv", "SE"),"Pris per kvadratmeter: %.2f kr\n", pricePerSquareMeter));
       sb.append(String.format(Locale.of("sv", "SE"),"Ursprunglig kostnad: %.2f kr\n", totalCostInitial));
       sb.append(String.format("Rabatt: %d %% \n", appliedRebatePercentage));
       sb.append(String.format(Locale.of("sv", "SE"),"Slutkostnad: %.2f kr", totalCostAfterRebate));
       outputToUser = sb.toString();
    }

    private void showOutputToUser() {
        JOptionPane.showMessageDialog(null, outputToUser);
    }
}
