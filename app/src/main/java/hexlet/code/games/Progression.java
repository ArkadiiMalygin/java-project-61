package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.BOUND_SMALL;

public class Progression {


    public static final int MINLENGTHOFPROGRESSION = 10;

    public static void game() {
        String[] arrAnswers = new String[ATTEMPTS];
        String[] arrQuestions = new String[ATTEMPTS];
        int i = 0;
        while (i < ATTEMPTS) {
            Random rand = new Random();
            StringBuilder question = new StringBuilder("Question: ");
            int randInt1 = rand.nextInt(BOUND_SMALL);
            int randInt2 = rand.nextInt(BOUND_SMALL);
            int k = 0;
            boolean f = false;
            int realAnswer = 0;
            for (; k <= MINLENGTHOFPROGRESSION; k++) {
                var temp = randInt1 + randInt2 * k;
                if (k == rand.nextInt(BOUND_SMALL) && !f) {
                    realAnswer = temp;
                    question.append(".. ");
                    f = true;
                } else {
                    question.append(temp).append(" ");
                }
            }
            if (!f) {
                realAnswer = randInt1 + randInt2 * (BOUND_SMALL + 1);
                question.append(".. ");
            }
            arrAnswers[i] = Integer.toString(realAnswer);

            arrQuestions[i] = question.toString();

            i++;
        }
        String task = "What number is missing in the progression?";
        Engine.game(arrAnswers, arrQuestions, task);
    }
}

