package classroom;

public class PlayWithObjects {
    public static void main(String[] args) {
        Animal barsik = new Animal();
        System.out.println(barsik.getName());
        barsik.setName("Barsik");
        barsik.setAge(7);
        barsik.setColor("Black");
        System.out.println(barsik.getName());
        System.out.println(barsik);



        Animal leo = new Animal();
        leo.setName("Leo");
        leo.setColor("White");
        leo.setAge(10);
        System.out.println(leo.getName());
        System.out.println(leo);
        barsik.walk();
        leo.walk();
        barsik.eat();
        leo.eat();


        Animal dori = new Animal();
        dori.setAge(1);
        dori.setName("Dori");
        dori.setColor("Blue");
        dori.swim();
        dori.eat();
        System.out.println(dori);


        Animal dino = new Animal();
        dino.setName("Dino");
        dino.setColor("Green");
        dino.setAge(999999);
        System.out.println(dino);
        dino.walk();
        dino.eat();




}

}