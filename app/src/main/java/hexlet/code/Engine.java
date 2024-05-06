package hexlet.code;

import java.util.Scanner;

import static hexlet.code.App.ATTEMPTS;

public class Engine {

    public static void game(String[] answers, String[] questions, String task) {
        Scanner info = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String userName = info.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(task);
        int i = 0;
        while (i < ATTEMPTS) {
            System.out.println(questions[i]);
            String userAnswer = info.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if (!answers[i].equals(userAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answers[i]
                        + "'.\n Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
            i++;
        }
        System.out.println("Congratulations, " + userName + "!");


    }
}
