import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Lektioner {

    private static int a;
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,4};

        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();


        for (int ele : arr) {
            map.put(ele, map.get(ele) == null ? 1 : map.get(ele)+1);
        }

//        for (Integer ele : map.keySet()) {
//            System.out.println(ele + "  " + map.get(ele));
//
//        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }


    }

}