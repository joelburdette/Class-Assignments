package hangmangame;

import java.util.Scanner;
/*
 * @author Joel Burdette
 */
public class HangmanGame {

    boolean checkHWin(int n, String[] tileArray) {
        if (n > 6) {//no win
            return false;
        }
        if (tileArray[n].equals(tileArray[n + 1]) && tileArray[n + 1].equals(tileArray[n + 2])) {//horizontalCheck
            System.out.println(tileArray[n] + " wins!");
            return true;
        } else {
            return checkHWin(n + 3, tileArray);
        }
    }

    boolean checkVWin(int n, String[] tileArray) {
        if (n > 2) {//no win
            return false;
        }
        if (tileArray[n].equals(tileArray[n + 3]) && tileArray[n + 3].equals(tileArray[n + 6])) {//verticalCheck
            System.out.println(tileArray[n] + " wins!");
            return true;
        } else {
            return checkVWin(n + 1, tileArray);
        }
    }

    boolean checkDWin(int n, String[] tileArray) {
        if (tileArray[n].equals(tileArray[n + 4]) && tileArray[n + 4].equals(tileArray[n + 8])) {//diagonalCheck
            System.out.println(tileArray[n] + " wins!");
            return true;
        } else if (tileArray[n + 6].equals(tileArray[n + 4]) && tileArray[n + 4].equals(tileArray[n + 2])) {//diagonalCheck
            System.out.println(tileArray[n + 6] + " wins!");
            return true;
        } else {
            return false;
        }
    }

    void displayTiles(String[] tileArray) {
        System.out.println("| " + tileArray[0] + " | " + tileArray[1] + " | " + tileArray[2] + " |");
        System.out.println("| " + tileArray[3] + " | " + tileArray[4] + " | " + tileArray[5] + " |");
        System.out.println("| " + tileArray[6] + " | " + tileArray[7] + " | " + tileArray[8] + " |");
    }

    public static void main(String[] args) {
        System.out.println("New Game");
        String[] tileArray = new String[9];
        for (int i = 0; i <= tileArray.length - 1; i++) {// Build new game
            Integer a = i + 1;
            String b = a.toString();
            tileArray[i] = b;
        }
        for (int i = 0; i < 9; i++) { //checkWin
            HangmanGame hangman = new HangmanGame();
            if (hangman.checkHWin(0, tileArray) || hangman.checkVWin(0, tileArray) || hangman.checkDWin(0, tileArray)) {
                break; //win the game
            }
            hangman.displayTiles(tileArray);//display tiles
            System.out.println("Enter tile number");
            Scanner in = new Scanner(System.in);
            int pos = in.nextInt();
            System.out.println("Enter either a x or an o");
            String value = in.next();
            tileArray[pos - 1] = value;
        }
    }
}
