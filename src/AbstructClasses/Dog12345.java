package AbstructClasses;

public class Dog12345 extends Animal12345 {
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
//if in Animal12345 we have abstract methods, we should release abstract methods in inheritance classes
// such as dog and cat
//    public void makeSound(){
//        System.out.println("Make Sound");
//    }
}
