package classroom;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner mult = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int answer = mult.nextInt();
        System.out.println("This is multiplication for number: " + answer);
        for (int i = 1; i <=10 ; i++) {
            int result = answer * i;
            System.out.println(String.format("%d * %d = %d", i, answer, result));

        }

    }
}
