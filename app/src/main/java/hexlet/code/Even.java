package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void game(){
        Scanner info = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String userName = info.nextLine();
        System.out.println("Hello, " + userName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int i = 0;
        while (i < 3) {
            Random rand = new Random();
            int randInt = rand.nextInt(100);
            String realAnswer;
            if (randInt % 2 == 0) {
                realAnswer = "yes";
            }
            else {
                realAnswer = "no";
            }
            System.out.println("Question: " + randInt);
            String userAnswer = info.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if (!realAnswer.equals(userAnswer)) {
                System.out.println("'"+ userAnswer + "' is wrong answer ;(. Correct answer was '" + realAnswer + "'.\n Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
            i++;
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
