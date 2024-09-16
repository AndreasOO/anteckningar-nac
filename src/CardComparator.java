import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        return card1.getValue() - card2.getValue();
    }
}
