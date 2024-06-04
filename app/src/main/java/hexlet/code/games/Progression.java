package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.QUESTION;
import static hexlet.code.App.ANSWER;
import static hexlet.code.App.BOUND_SMALL;

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
            int[] progression = newProgression(randInt1, randInt2);
            int k = 0;
            int secretStep = rand.nextInt(MINLENGTHOFPROGRESSION);
            for (; k < MINLENGTHOFPROGRESSION; k++) {
                if (k == secretStep) {
                    arrAnswerQuestions[i][ANSWER] = Integer.toString(isMissing(randInt1, randInt2, secretStep));
                    question.append(".. ");
                } else {
                    question.append(progression[k]).append(" ");
                }
            }

            arrAnswerQuestions[i][QUESTION] = question.toString();

            i++;
        }
        Engine.game(arrAnswerQuestions, PROGRESSION_TASK);
    }

    public static int isMissing(int randInt1, int randInt2, int step) {
        return randInt1 + randInt2 * step;
    }

    public static int[] newProgression(int randInt1, int randInt2) {
        int[] progression = new int[MINLENGTHOFPROGRESSION];
        int k = 0;
        for (; k < MINLENGTHOFPROGRESSION; k++) {
            progression[k] = randInt1 + randInt2 * k;
        }
        return progression;
    }
}

