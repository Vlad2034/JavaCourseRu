public class Inheritance {
    public static void main(String[] args) {
        InheritanceAnimal animal = new InheritanceAnimal();
        animal.eat();
        animal.sleep();

        System.out.println();

        InheritanceDog dog = new InheritanceDog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();
    }
}
