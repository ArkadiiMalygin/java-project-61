package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void userData() {
        Scanner info = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String userName = info.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
