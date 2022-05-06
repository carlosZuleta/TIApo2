package model;

public class Player {
    private int amountOfSeeds;
    private String character;

    public Player(int amountOfSeeds, String character) {
        this.amountOfSeeds = amountOfSeeds;
        this.character = character;
    }

    public int getAmountOfSeeds() {
        return amountOfSeeds;
    }

    public void setAmountOfSeeds(int amountOfSeeds) {
        this.amountOfSeeds = amountOfSeeds;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
