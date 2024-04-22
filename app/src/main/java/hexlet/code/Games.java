package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {
    public static void even(int count, int bound) {
        Scanner info = new Scanner(System.in);
        var userName = Engine.userData();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int i = 0;
        while (i < count) {
            Random rand = new Random();
            int randInt = rand.nextInt(bound);
            String realAnswer;
            if (randInt % 2 == 0) {
                realAnswer = "yes";
            } else {
                realAnswer = "no";
            }
            System.out.println("Question: " + randInt);
            String userAnswer = info.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if (!realAnswer.equals(userAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + realAnswer + "'.\n Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
            i++;
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void calc(int count, int bound, int dec) {
        Scanner info = new Scanner(System.in);
        var userName = Engine.userData();
        System.out.println("What is the result of the expression?");
        int i = 0;
        while (i < count) {
            Random rand = new Random();
            int randInt1 = rand.nextInt(bound);
            int randInt2 = rand.nextInt(bound);
            int randIntM = rand.nextInt(dec);
            int realAnswer;
            switch (randIntM) {
                case 0:
                    realAnswer = randInt1 + randInt2;
                    System.out.println("Question: " + randInt1 + " + " + randInt2);
                    break;
                case 1:
                    realAnswer = randInt1 - randInt2;
                    System.out.println("Question: " + randInt1 + " - " + randInt2);
                    break;
                default:
                    realAnswer = randInt1 * randInt2;
                    System.out.println("Question: " + randInt1 + " * " + randInt2);
                    break;
            }
            int userAnswer = info.nextInt();
            System.out.println("Your answer: " + userAnswer);
            if (realAnswer != userAnswer) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + realAnswer
                        + "'.\n Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
            i++;
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void gcd(int count, int bound) {
        Scanner info = new Scanner(System.in);
        var userName = Engine.userData();
        System.out.println("Find the greatest common divisor of given numbers.");
        int i = 0;
        while (i < count) {
            Random rand = new Random();
            int randInt1 = rand.nextInt(bound);
            int randInt2 = rand.nextInt(bound);
            int a = randInt1;
            int b = randInt2;
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            int realAnswer = a;
            System.out.println("Question: " + randInt1 + " " + randInt2);
            int userAnswer = info.nextInt();
            System.out.println("Your answer: " + userAnswer);
            if (realAnswer != userAnswer) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + realAnswer
                        + "'.\n Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
            i++;
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void progression(int count, int bound) {
        Scanner info = new Scanner(System.in);
        var userName = Engine.userData();
        System.out.println("What number is missing in the progression?");
        int i = 0;
        while (i < count) {
            Random rand = new Random();
            System.out.print("Question: ");
            int randInt1 = rand.nextInt(bound);
            int randInt2 = rand.nextInt(bound);
            int k = 0;
            boolean f = false;
            int realAnswer = 0;
            for (; k <= 10; k++) {
                var temp = randInt1 + randInt2 * k;
                if (k == rand.nextInt(10) && !f) {
                    realAnswer = temp;
                    System.out.print(".. ");
                    f = true;
                } else {
                    System.out.print(temp + " ");
                }
            }
            if (!f) {
                realAnswer = randInt1 + randInt2 * 11;
                System.out.print(".. ");
            }
            int userAnswer = info.nextInt();
            System.out.println("Your answer: " + userAnswer);
            if (realAnswer != userAnswer) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + realAnswer
                        + "'.\n Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
            i++;
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void prime(int count, int bound) {
        Scanner info = new Scanner(System.in);
        var userName = Engine.userData();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
            37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int i = 0;
        while (i < count) {
            Random rand = new Random();
            int randInt = rand.nextInt(bound);
            String realAnswer;
            boolean isPresent = false;
            for (int prime : primes) {
                if (prime == randInt) {
                    isPresent = true;
                    break;
                }
            }
            if (isPresent) {
                realAnswer = "yes";
            } else {
                realAnswer = "no";
            }
            System.out.println("Question: " + randInt);
            String userAnswer = info.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if (!realAnswer.equals(userAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + realAnswer
                        + "'.\n Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
            i++;
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
