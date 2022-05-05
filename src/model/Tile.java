package model;

public class Tile {

    private Player currentPlayer;
    private int position;
    private String seed;
    private Tile nextTiles;
    private Tile prevTiles;

    public Tile(int position) {
        this.position = position;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public Tile getNextTiles() {
        return nextTiles;
    }

    public void setNextTiles(Tile nextTiles) {
        this.nextTiles = nextTiles;
    }

    public Tile getPrevTiles() {
        return prevTiles;
    }

    public void setPrevTiles(Tile prevTiles) {
        this.prevTiles = prevTiles;
    }

}
