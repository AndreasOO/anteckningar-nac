import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Lektioner {
    public static void main(String[] args) {



        double years = 5730;
        double halveringstid = Math.log(2.0)/5730.0;

//        double percentageLeft = 100 * Math.exp(-halveringstid*years);
        double percentageLeft = 100 * Math.pow(2.71828,-halveringstid*years);


        System.out.println(percentageLeft);


    }
}