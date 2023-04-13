public class MethodsArguments {
    public static void main(String[] args) {

        PersonMA person1 = new PersonMA();
        person1.setNameAndAge("Vlad", 50);

        String s1 = "Vova";
        PersonMA person2 = new PersonMA();
        person2.setNameAndAge(s1, 21);

        person1.speak();
        person2.speak();

    }
}


class PersonMA {
    String name;
    int age;


    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    //метод void - ничего не возвращает в метод main
    void speak(){
        for (int i = 0; i < 3; i++){
            System.out.println("My name is " + name + ", and I am " + age + " years old");
        }
    }

    void sayHello(){
        System.out.println("Hi!");
    }

}
