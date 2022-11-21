package Animal;

public class Pig extends Animal{

    @Override
    public void eat() {
        System.out.println("I consume corn, soybean, barley, and wheat.");
    }

    @Override
    public void speak() {
        System.out.println("Pig goes Oink, Oink, Oink!");
    }
}
