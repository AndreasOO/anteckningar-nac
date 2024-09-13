import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lektioner {

    private static int a;
    public static void main(String[] args) throws ParseException {

        String str = "a";

        Matcher matcher;

        StringBuilder sbStart = new StringBuilder(str.length());
        StringBuilder sbEnd = new StringBuilder(str.length());

        for (int i = 0, j = str.length()-1; i < str.length(); i++, j--) {
            sbStart.append(str.charAt(i));
            sbEnd.insert(i,str.charAt(i));

            int totalIndexes = 0;
            if (i < str.length()-1 && sbStart.toString().contentEquals(sbEnd)) {
                matcher = Pattern.compile(sbStart.toString()).matcher(str);
                while (matcher.find()) {
                    System.out.println(matcher.group()+ " " + matcher.start() + " " + matcher.end());
                    totalIndexes += matcher.end() - matcher.start();

                }
                System.out.println(totalIndexes);
                if (totalIndexes == str.length()) {
                    System.out.println(true);
                    System.exit(0);
                }
                totalIndexes = 0;
            }


        }

        System.out.println(false);
//        System.out.println(sbStart.toString());
//        System.out.println(sbEnd.toString());
    }
}