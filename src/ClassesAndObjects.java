//такое обращение к полям не правильно в програмировании - get, set правильно
public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Vlad";
        person1.age = 50;
        System.out.println("My name is " + person1.name + ", and I am " + person1.age + " years old");

        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 21;
        System.out.println("My name is " + person2.name + ", and I am " + person2.age + " years old");

    }
}

class Person{
    String name;
    int age;
}


