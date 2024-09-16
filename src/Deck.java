import java.util.ArrayList;
import java.util.stream.Collectors;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        generateDeck();
    }

    private void generateDeck() {

        generateSuite("Hearts");
        generateSuite("Diamonds");
        generateSuite("Cloves");
        generateSuite("Spades");
    }

    private void generateSuite(String suite) {
        for (int i = 1; i <= 13; i++) {
            this.cards.add((Card) new Card(suite, i));
        }
    }

    public void printDeck() {
        System.out.println(this.cards);
    }

    public void sortDeckWithComparator() {
        this.cards.sort(new CardComparator());
    }

    public void sortDeck() {
        this.cards = this.cards.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
    }
}
