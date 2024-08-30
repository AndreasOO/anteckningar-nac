import javax.swing.*;

public class TaxesCalculator {
    private final int TAXES_PERCENTAGE = 25;
    private double priceWithoutTaxes;
    private double taxesPaid;
    private double userInputPrice;

    public TaxesCalculator() {

    }

    public void execute() {
        getUserInput();
        calculateTaxesPaid();
        calculatePriceWithoutTaxes();
        printOutputToUser();
    }

    private void getUserInput() {
        userInputPrice = Double.parseDouble(JOptionPane.showInputDialog("Ange pris: "));
    }

    private void calculateTaxesPaid() {
        taxesPaid = (TAXES_PERCENTAGE/100.0)*userInputPrice;
    }

    private void calculatePriceWithoutTaxes() {
        priceWithoutTaxes = userInputPrice-taxesPaid;
    }

    private void printOutputToUser() {
        JOptionPane.showMessageDialog(null,"Moms: " + taxesPaid);
        JOptionPane.showMessageDialog(null,"Pris utan moms: "  + priceWithoutTaxes);
    }
}
