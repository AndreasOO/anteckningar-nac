import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Lektioner {

    public static void main(String[] args) {
        TaxesCalculator taxesCalculator  = new TaxesCalculator();
        taxesCalculator.execute();

//        PhoneBillCalculator phoneBillCalculator = new PhoneBillCalculator();
//        phoneBillCalculator.execute();

//        GymTicketCalculator gtc = new GymTicketCalculator();
//        gtc.execute();

//        MathTestGrader mathTestGrader = new MathTestGrader();
//        mathTestGrader.execute();



        Random rand = new Random();

        System.out.println(rand.nextInt(0,100));

        System.out.println(Math.random()*7);















    }


}