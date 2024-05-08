package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.BOUND;

public class GCD {


    public static void game() {
        String[] arrAnswers = new String[ATTEMPTS];
        String[] arrQuestions = new String[ATTEMPTS];
        int i = 0;
        while (i < ATTEMPTS) {
            Random rand = new Random();
            int randInt1 = rand.nextInt(BOUND);
            int randInt2 = rand.nextInt(BOUND);

            int a = randInt1;
            int b = randInt2;
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            arrAnswers[i] = Integer.toString(a);

            arrQuestions[i] = "Question: " + randInt1 + " " + randInt2;

            i++;
        }
        String task = "Find the greatest common divisor of given numbers.";
        Engine.game(arrAnswers, arrQuestions, task);
    }
}

