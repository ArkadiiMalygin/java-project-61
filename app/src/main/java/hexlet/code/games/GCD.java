package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.QUESTION;
import static hexlet.code.App.ANSWER;
import static hexlet.code.App.BOUND;

public class GCD {

    public static final String GCD_TASK = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] arrAnswerQuestions = new String[ATTEMPTS][2];
        int i = 0;
        while (i < ATTEMPTS) {
            Random rand = new Random();
            int randInt1 = rand.nextInt(BOUND);
            int randInt2 = rand.nextInt(BOUND);

            arrAnswerQuestions[i][ANSWER] = Integer.toString(realGDC(randInt1, randInt2));

            arrAnswerQuestions[i][QUESTION] = "Question: " + randInt1 + " " + randInt2;

            i++;
        }
        Engine.game(arrAnswerQuestions, GCD_TASK);
    }

    public static int realGDC(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}

