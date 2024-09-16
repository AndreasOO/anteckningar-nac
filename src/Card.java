public class Card implements Comparable<Card> {
    private String suit;
    private int value;
    private int suitValue;


    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;

        getSuitvalue();
    }

    private void getSuitvalue() {
        switch (this.suit) {
            case "Cloves" -> suitValue = 1;
            case "Diamonds" -> suitValue = 2;
            case "Hearts" -> suitValue = 3;
            case "Spades" -> suitValue = 4;
        }
    }

    public String getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }

    public int compareTo(Card otherCard) {
        return this.suitValue - otherCard.suitValue;
//        return this.value - otherCard.value;
    }

    @Override
    public String toString() {
        return suit + " : " + value;
    }


}
