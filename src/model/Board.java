package model;

public class Board {

    private Tile first;
    private Tile last;

    public void createList(Tile current, Tile newTile) {
        if (current.getNextTiles() != null) {
            return;

        } else {
            if (current.getNextTiles() != null) {
                createList(current.getNextTiles(), newTile);
            } else {
                current.setNextTiles(newTile);
                newTile.setPrevTiles(current);
                first.setPrevTiles(newTile);
                createList(current, newTile);
            }
        }
    }

}