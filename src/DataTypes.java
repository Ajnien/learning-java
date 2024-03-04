public class DataTypes {
    public static void main(String[] args) {
        //Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);
        //Variable: double
        double temperature = 3.4;
        double price = 999.99;
        double weight = 1.5;
        System.out.println(temperature);
        System.out.println(price);
        System.out.println(weight);
        //Variable: float
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);
        //Casting
        int areaInteger = (int) area;
        System.out.println(Math.round(area));//округление
        //Variable: Char
        char symbol = '$';
        System.out.println(symbol);
        char a = 65;
        System.out.println(a);
        char l = 108;
        System.out.println(l);
        char i = 105;
        System.out.println(i);
        char s = 115;
        System.out.println(s);
        char e = 101;
        System.out.println(e);
        //Variable: Boolean
        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSummer = false;
        System.out.println(isRaining);
    }
}
