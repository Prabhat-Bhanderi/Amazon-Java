package amazon.homework.week1;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    int numberToGuess;

    public static void main(String[] args) {

        NumberGame numberGame = new NumberGame();
        Random random = new Random();

        numberGame.numberToGuess = random.nextInt(10);

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the number guessing game! I have chosen a number between 0 and 9. Can you guess it?");

        int numberGuessed = input.nextInt();
        int counter = 1;

        while (numberGuessed != numberGame.numberToGuess) {
            counter++;
            if (numberGuessed < numberGame.numberToGuess) {
                System.out.println("Your guess is too low. Try again!");
            } else {
                System.out.println("Your guess is too high. Try again!");
            }
            numberGuessed = input.nextInt();
        }
        System.out.println("Congratulations! You guessed the number " + numberGame.numberToGuess + " in " + counter + " attempts.");
        if(counter < 5){
            System.out.println("You are a pro!");
        }else {
            System.out.println("You need to improve your guess!");
        }
    }
}