package classroom;

import java.util.Scanner;
import java.util.SortedMap;

public class Palindrome {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please, enter a word");
        String word = myScanner.nextLine();
        //civic
        //c = [0]
        //i = [1]
        //civic.length = will return character count;

        String iterated = "";
        for (int i = word.length()-1; i >=0; i--) {
            iterated = iterated + word.charAt(i);
        }
        if(word.equals(iterated)){
            System.out.println("This word is palidrome");
        }else{
            System.out.println("This word in not a palidrome");
        }
    }
}
