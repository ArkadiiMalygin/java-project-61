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
    public static final int BOUND_SMALL = 100;
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
            case 2:
                Even.game();
                break;
            case 3:
                Calc.game();
                break;
            case 4:
                GCD.game();
                break;
            case 5:
                Progression.game();
                break;
            case 6:
                Prime.game();
                break;
            default:
                System.out.println("Please learn to choose and come back when ever u rdy");
                break;
        }
    }
}
