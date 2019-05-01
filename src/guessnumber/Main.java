package guessnumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int random, guess, attempts;
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		random = generator.nextInt(100);
		attempts = 1;

		System.out.println("I picked a number between " 
		+ "1 and 100. Can you guess the number?");

		guess = keyboard.nextInt();

		while (guess != random) {
			if (guess > random) {
				System.out.println("Enter a smaller number!");
				attempts += 1;
			} else {
				System.out.println("Enter a higher number!");
				attempts += 1;
			}
			guess = keyboard.nextInt();
		}
		System.out.println(random + " is the correct answer and it took you " 
		+ attempts + " attempts to guess it!");
		keyboard.close();
	}
}
