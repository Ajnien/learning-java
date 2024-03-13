package classroom;

import java.util.Scanner;

public class SumForEvenNumbers {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int userInput = myScanner.nextInt();

        if (userInput<=0){
            System.out.println("Please input positive number");
        }else{
            int sum = 0;
            for (int i = 2; i <=userInput ; i=i+2) {
                sum = sum + i;
            }
            System.out.println("Summa: " + sum);

        }
    }
}
