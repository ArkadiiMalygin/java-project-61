package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.*;

public class Progression {


    public static final int MINLENGTHOFPROGRESSION = 10;
    public static final String PROGRESSION_TASK = "What number is missing in the progression?";

    public static void game() {
        String[][] arrAnswerQuestions = new String[ATTEMPTS][2];
        int i = 0;
        while (i < ATTEMPTS) {
            Random rand = new Random();
            StringBuilder question = new StringBuilder("Question: ");
            int randInt1 = rand.nextInt(BOUND_SMALL);
            int randInt2 = rand.nextInt(BOUND_SMALL);
            int k = 0;
            boolean f = false;
            for (; k <= MINLENGTHOFPROGRESSION; k++) {
                var temp = randInt1 + randInt2 * k;
                if (k == rand.nextInt(BOUND_SMALL) && !f) {
                    arrAnswerQuestions[i][ANSWER] = Integer.toString(isMissing(randInt1, randInt2, k));
                    question.append(".. ");
                    f = true;
                } else {
                    question.append(temp).append(" ");
                }
            }
            if (!f) {
                arrAnswerQuestions[i][ANSWER] = Integer.toString(isMissing(randInt1, randInt2, BOUND_SMALL + 1));
                question.append(".. ");
            }

            arrAnswerQuestions[i][QUESTION] = question.toString();

            i++;
        }
        Engine.game(arrAnswerQuestions, PROGRESSION_TASK);
    }

    public static int isMissing(int randInt1, int randInt2, int step){
        return randInt1 + randInt2 * step;
    }
}

