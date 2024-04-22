package hexlet.code;


import java.util.Scanner;

public class App {
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
                Games.even(3, 100);
                break;
            case 3:
                Games.calc(3, 100, 3);
                break;
            case 4:
                Games.gcd(3,100);
                break;
            case 5:
                Games.progression(3, 10);
                break;
            case 6:
                Games.prime(3, 100);
                break;
            default:
                System.out.println("Please learn to choose and come back when ever u rdy");
                break;
        }
    }
}
