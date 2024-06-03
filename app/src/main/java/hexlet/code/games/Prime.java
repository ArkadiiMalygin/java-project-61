package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.QUESTION;
import static hexlet.code.App.ANSWER;
import static hexlet.code.App.BOUND;

public class Prime {

    public static final String PRIME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        String[][] arrAnswerQuestions = new String[ATTEMPTS][2];
        int i = 0;
        while (i < ATTEMPTS) {
            Random rand = new Random();
            int randInt1 = rand.nextInt(BOUND);
            if (isPrime(randInt1)) {
                arrAnswerQuestions[i][ANSWER] = "yes";
            } else {
                arrAnswerQuestions[i][ANSWER] = "no";
            }

            arrAnswerQuestions[i][QUESTION] = "Question: " + randInt1;

            i++;
        }

        Engine.game(arrAnswerQuestions, PRIME_TASK);
    }

    public static Boolean isPrime(int randInt1) {
        if (randInt1 < 2) {
            return false;
        }
        int divider = 2;

        while (randInt1 > divider) {
            if (randInt1 % divider == 0) {
                return false;
            }
            divider++;
        }

        return true;

    }
}
