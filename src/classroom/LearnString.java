package classroom;

public class LearnString {
    public static void main(String[] args) {
        //String
        String name = "Alise";
        String lastName = "Plinta";
        System.out.println(name);
        System.out.println(lastName);
        //Exercise: Print name and surname (Example: John Doe);
        String fullName = name + " " + lastName;
        System.out.println(fullName);
        System.out.println(String.format("%s %s", name, lastName));
        String myFullName = String.format("%s %s",name, lastName);
        System.out.println(myFullName);

        String hello = "HELLO";
        String world = "WORLD";
        System.out.println(hello + " " + world);
        System.out.println(String.format("%s %s", hello, world));
        String fullWord = hello + " " + world;
        System.out.println(fullWord);

        String hello1 = "Hello, ";
        String world1 = "World!";
        String helloWorld = hello1.concat(world1); //две переменные в одной другой переменной
        System.out.println(helloWorld);

        // variable with name
        //variable with pr.language
        //concatenate the two strings to form a message My name is --. I love coding in pr.language
        //print it out

        String name1 = "My name is Ajnien. ";
        String language = "I like programming on Java 11.";
        String complex = name1.concat(language);
        System.out.println(complex);


        String randomText = "Some text";
        System.out.println(randomText.toUpperCase());
        //Java statements


    }
}
