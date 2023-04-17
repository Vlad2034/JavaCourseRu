package AbstructClasses;

public class Test12345 {
    public static void main(String[] args) {
        // Animal12345 animal = new Animal12345(); it is error after class Animal12345 turned to abstract
        Dog12345 dog = new Dog12345();
        Cat12345 cat = new Cat12345();

        dog.makeSound();
        cat.makeSound();

        dog.eat();
        cat.eat();
    }
}
