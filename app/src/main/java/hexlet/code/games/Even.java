package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.BOUND;

public class Even {



    public static void game() {
        String[] arrAnswers = new String[ATTEMPTS];
        String[] arrQuestions = new String[ATTEMPTS];
        int i = 0;
        while (i < ATTEMPTS) {
            Random rand = new Random();
            int randInt = rand.nextInt(BOUND);
            arrQuestions[i] = "Question: " + randInt;
            if (randInt % 2 == 0) {
                arrAnswers[i] = "yes";
            } else {
                arrAnswers[i] = "no";
            }
            i++;
        }
        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.game(arrAnswers, arrQuestions, task);
    }
}
