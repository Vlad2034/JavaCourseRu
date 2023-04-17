package AbstructClasses;

public abstract class Animal12345 {

    String name = "Some animal";
    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void makeSound();
    //abstract methods don't have body
    //it is abstract because each animal makes sound different
}
