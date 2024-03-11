package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {
        //if statement
        /*
        if(condition) {
        //code to be executed if the condition is true!
        }
         */
        if (true) {
            System.out.println("This code is executed!");
        }
        int x = 10;
        if (x > 5) {
            System.out.println("X is greater than 5");
        }
        if (x > 12) {
            System.out.println("X is greater than 12");
        }
        boolean isSpring = false;
        if (!isSpring) {
            System.out.println("it is Spring!");
        }
        //what returns true or false
        //Comparison: >, <, ==, >=, <=, !=

        //if-else
        //Child:<=12 age
        //Teen: >=12 & <=59
        //else: Senior
        int age = 53;

        if (age <= 12) {
            System.out.println("This is child!");
        } else {
            System.out.println("Something else!");
        }
        //if-else-if-else
        if (age <= 12) {
            System.out.println("It is child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is teenager!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("This is adult!");
        } else {
            System.out.println("This is senior!");
        }
        //program that checks if a given number is negative, positive zero

        int num = -1;
        if (num > 0) {
            System.out.println("is positive");
        } else if (num <= -1) {
            System.out.println("is negative");
        } else if (num == 0) {
            System.out.println("is zero");
        }


        //program that checks the time of day
        int time = 26;
        if (time >= 0 && time <= 4) {
            System.out.println("Good night!");
        } else if (time >= 5 && time <= 12) {
            System.out.println("Good morning!");
        } else if (time >= 13 && time <= 17) {
            System.out.println("Good afternoon!");
        } else if (time >= 18 && time <= 23) {
            System.out.println("Good evening!");
        } else if (time == 24) {
            System.out.println("Good night!");
        }
        else {
            System.out.println("sorry??" + time + "??");;
    }
}
}
