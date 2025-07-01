package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 5) + 1;
        int maxTry = 3;
        boolean guessedCorrectly = false;

        System.out.println("I'm thinking of a number between 1 and 5");
        for (int tryCount=1;tryCount<=maxTry;tryCount++){
            System.out.printf("Guess %d: ", tryCount);
            int guess = sc.nextInt();
            if (guess == secretNumber){
                System.out.println("You guessed it!");
                System.out.println("You win!");
                break;
            } else if (guess > 5) {
                System.out.println("Invalid number input. Enter numbers 1-5");
                break;
            } else {
                System.out.println("Wrong guess.");
            }
        }

        if (!guessedCorrectly){
            System.out.printf("You lose. The correct number was %d", secretNumber);
        }
        sc.close();
    }
}