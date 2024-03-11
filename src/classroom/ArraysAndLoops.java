package classroom;

import java.util.Arrays;
import java.util.logging.SocketHandler;

public class ArraysAndLoops {
    public static void main(String[] args) {
        //Arrow
        //Bread; Milk; Eggs; Fruits;
        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};
        int[] grades = {7, 9, 10, 6, 5, 4};
        String[] seasons = {"Summer", "Fall", "Winter", "Spring"};
        String eggs = shoppingList[2];
        System.out.println(eggs);
        System.out.println(grades[4]);
        grades[0] = 2;
        System.out.println(grades[0]);
        System.out.println(Arrays.toString(grades));
        System.out.println(grades[5]);
        //empty Array
        int[] emptyArray = new int[4];
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));
        String[] names = {"Alise", "Darja", "Edgars", "Nikita", "Elza"};
        System.out.println(Arrays.toString(names));
        names[4] = "Marks";
        System.out.println(names[4]);
        System.out.println(Arrays.toString(names));
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        double[] num = new double[5];
        System.out.println(Arrays.toString(num));
        num[0] = 0.52;
        num[1] = 7.54;
        num[2] = 98.1;
        num[3] = 3.5;
        num[4] = 7.87;
        System.out.println(Arrays.toString(num));
//        for (int i = 0; i < shoppingList.length; i++) {
//            System.out.println("Buy " + shoppingList[i]);
//        }
////        for (int i = 0; i <= 9; i++) {
////            System.out.println(i);
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Sum: "+ sum);
        for (int i = 0; i <= 2; i++) {
            System.out.println(shoppingList[i]);
        }
        for (String s : shoppingList) {
            System.out.println(s);
        }
        int i = 0;
        do {
            System.out.println("Buy" + shoppingList[i]);
            i++;
        } while (i < shoppingList.length);

        for (i = 10; i >= 0; i--) {
            System.out.println(i);
        }


        for (int j = 2; j <= 100; j++) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
        for (int j = 2; j <= 100; j++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }

        }


    }


}
