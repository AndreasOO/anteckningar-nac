import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lektioner {

    public static void main(String[] args) {
//        TaxesCalculator taxesCalculator  = new TaxesCalculator();
//        taxesCalculator.execute();

//        PhoneBillCalculator phoneBillCalculator = new PhoneBillCalculator();
//        phoneBillCalculator.execute();
//
//        GymTicketCalculator gtc = new GymTicketCalculator();
//        gtc.execute();

//        MathTestGrader mathTestGrader = new MathTestGrader();
//        mathTestGrader.execute();

        // Beräkna radix med vinkel
        double angle = 60;
        double radix = angle*(Math.PI/180.0);
//        System.out.println(radix);

        // problem, parseInt metoden nere får numberformat exception pga inte hittar E. Lös på bättre sätt.
        double a = 9.99;
        double b = 9.98;
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2) - 2*(a*b)*Math.cos(radix));

        double diffAB = Math.abs(a-b);
        double diffAC = Math.abs(a-c);
        double diffBC = Math.abs(b-c);

        String diffStringAC = String.valueOf(diffAC);
        int exponentAC = Integer.parseInt(diffStringAC.substring(diffStringAC.indexOf("E")+1));

        String diffStringAB = String.valueOf(diffAB);
        int exponentAB = diffAB == 0.0 ? 1 : Integer.parseInt(diffStringAB.substring(diffStringAB.indexOf("E")+1));

        String diffStringBC = String.valueOf(diffBC);
        int exponentBC = diffBC == 0.0 ? 1 : Integer.parseInt(diffStringBC.substring(diffStringBC.indexOf("E")+1));

        System.out.println(exponentAB);















    }


}