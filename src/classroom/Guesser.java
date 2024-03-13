package classroom;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Guesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(10) + 1;
        System.out.println("Guess the right number from 1 to 10");
        int answer = input.nextInt();


        boolean isGuessed = false; //or true, but isGuessed will be with "!"

        while (!isGuessed) {
            if (num == answer) {
                System.out.println("You guessed the number");
                isGuessed = true;
            } else {
                System.out.println("Incorrect guess, please try again");
                answer = input.nextInt();
            }

        }
    }
}
