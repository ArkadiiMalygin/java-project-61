package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.QUESTION;
import static hexlet.code.App.ANSWER;
import static hexlet.code.App.BOUND;

public class Even {


    public static final String EVEN_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {
        String[][] arrAnswerQuestions = new String[ATTEMPTS][2];
        int i = 0;
        while (i < ATTEMPTS) {
            Random rand = new Random();
            int randInt = rand.nextInt(BOUND);
            arrAnswerQuestions[i][QUESTION] = "Question: " + randInt;
            if (isEven(randInt)) {
                arrAnswerQuestions[i][ANSWER] = "yes";
            } else {
                arrAnswerQuestions[i][ANSWER] = "no";
            }
            i++;
        }
        Engine.game(arrAnswerQuestions, EVEN_TASK);
    }

    public static Boolean isEven(int randInt) {
        return randInt % 2 == 0;
    }
}
