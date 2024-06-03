package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.QUESTION;
import static hexlet.code.App.ANSWER;
import static hexlet.code.App.BOUND;

public class Calc {


    public static final String CALC_TASK = "What is the result of the expression?";

    public static void game() {
        String[][] arrAnswerQuestions = new String[ATTEMPTS][2];
        int i = 0;
        while (i < ATTEMPTS) {
            Random rand = new Random();
            String[] decimals = {"+", "-", "*"};
            int randInt1 = rand.nextInt(BOUND);
            int randInt2 = rand.nextInt(BOUND);
            int randIntM = rand.nextInt(decimals.length);
            arrAnswerQuestions[i][ANSWER] = Integer.toString(calcRealAnswer(randInt1, randIntM, randInt2));
            switch (randIntM) {
                case 0:
                    arrAnswerQuestions[i][QUESTION] = "Question: " + randInt1 + " + " + randInt2;
                    break;
                case 1:
                    arrAnswerQuestions[i][QUESTION]  = "Question: " + randInt1 + " - " + randInt2;
                    break;
                case 2:
                    arrAnswerQuestions[i][QUESTION] = "Question: " + randInt1 + " * " + randInt2;
                    break;
                default:
                    arrAnswerQuestions[i][QUESTION] = "Smth went wrong!";
                    break;
            }
            i++;
        }
        Engine.game(arrAnswerQuestions, CALC_TASK);
    }

    public static Integer calcRealAnswer(int randInt1, int randIntM, int randInt2) {
        return switch (randIntM) {
            case 0 -> randInt1 + randInt2;
            case 1 -> randInt1 - randInt2;
            case 2 -> randInt1 * randInt2;
            default -> null;
        };
    }
}
