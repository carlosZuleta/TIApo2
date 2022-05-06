package main;

import java.util.Scanner;

import model.Game;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static Board board = new board();




    public static void main(String[] args) {


        int op = -1;
        while (op != 0) {
            op = showMenu();
            options(op);
        }
    }

    private static void options(int num) {
        switch (num) {
            case 1:
                ;
                break;
            case 2:
                ;
                break;
            case 3:
                ;
                break;
            case 4:
                ;
                break;
            case 5:

                starNewGame();

                break;
        }

    }

    public static int showMenu() {

        System.out.println("Select the option:\n");
        System.out.println("1. Throw the dice\n");
        System.out.println("2. Show board\n");
        System.out.println("3. Show links\n");
        System.out.println("4. Show score\n");
        System.out.println("5. Start new game\n");

        Game g = new Game(5, 5, 5);

        return sc.nextInt();

    }

    public static void starNewGame(){
        System.out.println("digit the number of colums");
        sc.nextInt();
        System.out.println("digit the number of raw");
        sc.nextInt();






    }


}
