package hexlet.code;

import java.util.Scanner;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.QUESTION;
import static hexlet.code.App.ANSWER;


public class Engine {

    public static void game(String[][] arrAnswerQuestions, String task) {
        Scanner info = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String userName = info.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(task);
        int i = 0;
        while (i < ATTEMPTS) {
            System.out.println(arrAnswerQuestions[i][QUESTION]);
            String userAnswer = info.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if (!check(arrAnswerQuestions[i][ANSWER], userAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + arrAnswerQuestions[i][ANSWER] + "'.\n Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
            i++;
        }
        System.out.println("Congratulations, " + userName + "!");


    }

    public static boolean check(String realAnswer, String userAnswer) {
        return realAnswer.equals(userAnswer);
    }
}
