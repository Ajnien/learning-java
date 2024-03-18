package classroom;

public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSum(44,20));

        printTextMultipleTimes("Hello World",5);
        String[] listOfFruits = {"Apple", "Pear", "Banana", "Pineapple"};
        printAllValuesFromStringArray(listOfFruits);
        int [] numbers = {1,2,3,7,9};
        printSumOfArrayNumbers(numbers);

    }

    private static int printSumOfArrayNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <numbers.length ; i++) {
            sum = sum+ numbers[i];
        }
        return sum;
    }


    public static int calculateSum(int x, int y) {
        return x + y;
    }
    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }
    public static void printAllValuesFromStringArray(String[] stringArray){
        for (int i = 0; i < stringArray.length ; i++) {
            System.out.println(stringArray[i]);

        }


        }
        public static boolean isEven(int number){
        return number % 2 == 0;

}


    }

