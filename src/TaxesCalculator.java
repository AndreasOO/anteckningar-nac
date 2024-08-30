import javax.swing.*;

public class TaxesCalculator {
    private final int TAXES_PERCENTAGE = 25;
    private double priceWithoutTaxes;
    private double taxesPaid;
    private double UserInputPrice;

    public TaxesCalculator() {

    }

    public void execute() {
        getUserInput();
        calculateTaxesPaid();
        calculatePriceWithoutTaxes();
        printOutputToUser();
    }

    private void getUserInput() {
        UserInputPrice = Double.parseDouble(JOptionPane.showInputDialog("Ange pris: "));
    }

    private void calculateTaxesPaid() {
        taxesPaid = (TAXES_PERCENTAGE/100.0)*UserInputPrice;
    }

    private void calculatePriceWithoutTaxes() {
        priceWithoutTaxes = UserInputPrice-taxesPaid;
    }

    private void printOutputToUser() {
        JOptionPane.showMessageDialog(null,"Moms: " + taxesPaid);
        JOptionPane.showMessageDialog(null,"Pris utan moms: "  + priceWithoutTaxes);
    }
}
