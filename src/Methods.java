public class Methods {

    public static void main(String[] args) {

        PersonM person1 = new PersonM();
        person1.name = "Vlad";
        person1.age = 50;
        //вызов методов
        person1.speak();
        person1.sayHello();

        PersonM person2 = new PersonM();
        person2.name = "Vova";
        person2.age = 21;

        person2.speak();;
        person2.sayHello();
    }
}

class PersonM{
    String name;
    int age;

    void speak(){
        System.out.println("My name is " + name + ", and I am " + age + " years old");
        //or
        for (int i = 0; i < 3; i++){
            System.out.println("My name is " + name + ", and I am " + age + " years old");
        }
    }

    void sayHello(){
        System.out.println("Hi!");
    }
}

