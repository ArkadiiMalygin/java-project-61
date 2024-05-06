package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.App.ATTEMPTS;
import static hexlet.code.App.BOUND;

public class Calc {

    public static String[] questions;
    public static String[] answers;
    public static String task;



    public static void game() {
        String[] arrAnswers = new String[ATTEMPTS];
        String[] arrQuestions = new String[ATTEMPTS];
        int i = 0;
        while (i < ATTEMPTS) {
            Random rand = new Random();
            String[] decimals = {"+", "-", "*"};
            //String decimal; how to put it into calculations
            int randInt1 = rand.nextInt(BOUND);
            int randInt2 = rand.nextInt(BOUND);
            int randIntM = rand.nextInt(decimals.length);
            int realAnswer;
            switch (randIntM) {
                case 0:
                    realAnswer = randInt1 + randInt2;
                    arrAnswers[i] = Integer.toString(realAnswer);
                    arrQuestions[i] = "Question: " + randInt1 + " + " + randInt2;
                    break;
                case 1:
                    realAnswer = randInt1 - randInt2;
                    arrAnswers[i] = Integer.toString(realAnswer);
                    arrQuestions[i] = "Question: " + randInt1 + " - " + randInt2;
                    break;
                default:
                    realAnswer = randInt1 * randInt2;
                    arrAnswers[i] = Integer.toString(realAnswer);
                    arrQuestions[i] = "Question: " + randInt1 + " * " + randInt2;
                    break;
            }
            i++;
        }
        questions = arrQuestions;
        answers = arrAnswers;
        task = "What is the result of the expression?";
        Engine.game(answers, questions, task);
    }
}
