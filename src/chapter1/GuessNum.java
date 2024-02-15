package chapter1;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 100;

        Random random = new Random();
        int secret = random.nextInt(max - min) + min;
        System.out.println("The secret number is: " + secret);

        while (true) {
            System.out.print("Make a guess (between " + min + " and " + max + "): ");
            int guess = scanner.nextInt();

            if (guess < min || guess > max) {
                System.out.println("Please guess a valid number~");
                continue;
            }

            if (guess == secret) {
                System.out.println("You win ~~ The secret number is: " + secret);
                break;
            } else if (guess > secret) {
                max = guess;
            } else {
                min = guess;
            }
        }

    }
}
