package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.BOUND;

public class Prime {


    public static String[] questions;
    public static String[] answers;
    public static String task;



    public static void game() {
        String[] arrAnswers = new String[ATTEMPTS];
        String[] arrQuestions = new String[ATTEMPTS];
        int i = 0;
        while (i < ATTEMPTS) {
            Random rand = new Random();
            int randInt1 = rand.nextInt(BOUND);

            int divider = 2;

            while (randInt1 > divider) {
                if (randInt1 % divider == 0) {
                    arrAnswers[i] = "no";
                    break;
                }
                divider++;
            }
            if (randInt1 == divider) {
                arrAnswers[i] = "yes";
            }

            arrQuestions[i] = "Question: " + randInt1;

            i++;
        }
        questions = arrQuestions;
        answers = arrAnswers;
        task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.game(answers, questions, task);
    }
}
