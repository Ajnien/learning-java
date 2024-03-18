package classroom;

public class Animal {
    public String name;
    public int age;
    public String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void walk(){
        System.out.println("I am walking rigth now!");
    }

    public void eat(){
        System.out.println("I am eating!");
    }
    public void swim(){
        System.out.println("I am swiming!");
    }
}

