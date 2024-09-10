import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Lektioner {


    public static void main(String[] args) {

        String[] books = {"book1", "book2", "book3"};

        String firstBook = books[0];
        String lastBook = books[books.length-1];

        Arrays.sort(books);

        Arrays.stream(books).forEach(System.out::println);

        System.out.println(books.length);

        String[] booksPlusOne = new String[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            booksPlusOne[i] = books[i];
        }
        booksPlusOne[booksPlusOne.length-1] = "book4";
        Arrays.stream(booksPlusOne).forEach(System.out::println);


        String[] booksCopy = Arrays.copyOf(books, books.length+1);
        booksCopy[booksCopy.length-1] = "book5";
        Arrays.stream(booksCopy).forEach(System.out::println);

    }
}