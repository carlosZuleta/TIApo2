package model;

public class Game {

    private int n;
    private int m;
    private int q;
    private Tile head;

    public Game(int n, int m, int q) {
        this.n = n;
        this.m = m;
        this.q = q;
        initGame();
    }

    public void initGame() {

        createTable(n, m);
        createSeeds(q);

    }

    public void createTable(int n, int m) {
        int total = n * m;
        int number = 1;

        head = new Tile(number);
        Tile current = head;

        while (number < total) {
            number++;

            Tile newTile = new Tile(number);

            current.setNextTiles(newTile);
            newTile.setPrevTiles(current);

            // System.out.println(number);

        }

    }

    public void createSeeds(int q) {
        int seed = (int) Math.floor(Math.random() * (n * m) + 1);

    }

}
