package za.co.advance.enums;

public enum CardSuit {
    SPADES("Spades", '\u2660'),
    DIAMONDS("Diamonds", '\u2666'),
    CLUBS("Clubs", '\u2663'),
    HEARTS("Hearts", '\u2764');

    private String name;
    private char suitSymbol;
    CardSuit(String name, char suitSymbol){
        this.name = name;
        this.suitSymbol = suitSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSuitSymbol() {
        return suitSymbol;
    }

    public void setSuitSymbol(char suitSymbol) {
        this.suitSymbol = suitSymbol;
    }
}
