package Animal;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("I eat chicken kibbles, chicken, treats, and anything I can find");
    }

    @Override
    public void speak() {
        System.out.println("Dogs goes Bark! Bark! Bark! Grrrrr.... Bark!");
    }
}
