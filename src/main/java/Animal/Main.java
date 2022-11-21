package Animal;

public class Main {
    public static void main(String[] args) {
        Cat kittyCat = new Cat();
        kittyCat.eat();
        kittyCat.speak();

        System.out.println("**********************************************");

        Dog sushi = new Dog();
        sushi.eat();
        sushi.speak();

        System.out.println("**********************************************");
        
        Dog peppi = new Dog();
        peppi.eat();
        peppi.speak();
    }
}