package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter." +
                "\n0 - exit" +
                "\n1 - greet" +
                "\n2 - even" +
                "\n3 - calc" +
                "\n4 - GCD" +
                "\n5 - progression" +
                "\n6 - prime");
        int gameOption = info.nextInt();
        System.out.println("Your choice:" + gameOption + "\n\n");
        switch(gameOption) {
            case 0:
                System.out.println("Have a nice day!");
                break;
            case 1:
                Cli.userData();
                break;
            case 2:
                Games.even();
                break;
            case 3:
                Games.calc();
                break;
            case 4:
                Games.GCD();
                break;
            case 5:
                Games.progression();
                break;
            case 6:
                Games.prime();
                break;
            default:
                System.out.println("Please learn to choose and come back when ever u rdy");
                break;
        }
    }
}
