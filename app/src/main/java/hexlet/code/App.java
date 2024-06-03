package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static final int ATTEMPTS = 3;
    public static final int BOUND = 100;
    public static final int BOUND_SMALL = 10;
    public static final int CHOOSEPRIME = 6;
    public static final int CHOOSEPROGRESSION = 5;
    public static final int CHOOSEGCD = 4;
    public static final int CHOOSECALCULATION = 3;
    public static final int CHOOSEEVEN = 2;
    public static final int ANSWER = 0;
    public static final int QUESTION = 1;

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                0 - exit
                1 - greet
                2 - even
                3 - calc
                4 - GCD
                5 - progression
                6 - prime""");
        int gameOption = info.nextInt();
        System.out.println("Your choice: " + gameOption + "\n");
        switch (gameOption) {
            case 0:
                System.out.println("Have a nice day!");
                break;
            case 1:
                Cli.userData();
                break;
            case CHOOSEEVEN:
                Even.game();
                break;
            case CHOOSECALCULATION:
                Calc.game();
                break;
            case CHOOSEGCD:
                GCD.game();
                break;
            case CHOOSEPROGRESSION:
                Progression.game();
                break;
            case CHOOSEPRIME:
                Prime.game();
                break;
            default:
                System.out.println("Please learn to choose and come back when ever u rdy");
                break;
        }
    }
}
