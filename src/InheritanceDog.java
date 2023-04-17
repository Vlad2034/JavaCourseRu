public class InheritanceDog extends InheritanceAnimal{

    public void eat(){
        System.out.println("Dog is eating");//переопределяем класс eat -
        // теперь этот метод является главным для класса Dog
    }
    public void bark(){
        System.out.println("I am barking");
    }

    public void showName(){
        System.out.println(name);
    }


}
