import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Lektioner {



    Lektioner() {
    }

    public static void main(String[] args) {
        TaxesCalculator taxesCalculator  = new TaxesCalculator();
        taxesCalculator.execute();

    }



}