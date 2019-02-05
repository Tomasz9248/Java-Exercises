package Algorithms.BinarySearch;

import java.util.Scanner;

/* Popular example when we use binary search algorithm is guess number game.
One person thinks about random number and the other one job is to ques the number.
The second person is informed after every shot if the number is too small or too large
 */
public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to guess between 0 and 1000000:");
        int searchKey = sc.nextInt();
        int currentGuess = -1;
        int lowerBound = 0;
        int upperBound = 1000000;
        int steps = 0;

        while (searchKey != currentGuess) {
            try {
                System.out.println("Guess number between " + lowerBound + " and " + upperBound);
                currentGuess = sc.nextInt();
                steps++;
                if (searchKey == currentGuess) break;
                if (currentGuess > upperBound || currentGuess < lowerBound) {
                    System.out.println("Number is not in the range.");
                } else if (searchKey > currentGuess) {
                    System.out.println("Your number is too low.");
                    lowerBound = currentGuess + 1;
                } else {
                    System.out.println("Your number is too big.");
                    upperBound = currentGuess - 1;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Enter integer only.");
            }
        }
            System.out.println("The number was " + searchKey + ". You succeed in " + steps + " steps! Congratulation!");
        }
    }