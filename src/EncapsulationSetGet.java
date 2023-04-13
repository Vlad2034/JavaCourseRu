public class EncapsulationSetGet {
    public static void main(String[] args) {

        PersonE person1 = new PersonE();
        person1.setName("Vlad");
        person1.setAge(10);

        System.out.println("выводим значение name в main методе: " + person1.getName());
        System.out.println("выводим значение age в main методе: " + person1.getAge());

        person1.speak();
    }
}

class PersonE {
    private String name;
    private int age;
    // variables видны в собственном класс, но не в других классах

    // encapsulation удобна тем что изменения внутри класса
    // не видны конечному пользователю потому что пользователь обращается через get and set
    // например могу изменить имя переменную name на другое имя или включить проверку в set метод
    public void setName(String username){
        if (username.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            name = username;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0 ) {
            System.out.println("Возвраст должен быть больше нуля");
        } else {
            age = userAge;
        }
    }
    public int getAge(){
        return age;
    }
    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
        //после return ничего не исполняется в коде
    }
    //метод void - ничего не возвращает в метод main
    void speak() {
        System.out.println("My name is " + name + ", and I am " + age + " years old");
        //or
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", and I am " + age + " years old");
        }
    }
    void sayHello() {
        System.out.println("Hi!");
    }
}
