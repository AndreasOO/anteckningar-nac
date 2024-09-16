import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Lektioner {
    private static char ch;
    private static int a;
    public static void main(String[] args) {


        Card card = new Card("Cloves", 2);
        System.out.println(card.toString());

        Deck deck = new Deck();
        deck.printDeck();
        deck.sortDeck();

        deck.printDeck();


        System.out.println("------");
        deck.sortDeckWithComparator();
        deck.printDeck();

        deck.sortDeck();
        deck.printDeck();
    }

}