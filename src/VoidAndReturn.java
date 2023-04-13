public class VoidAndReturn {
    public static void main(String[] args) {

        PersonVAR person1 = new PersonVAR();
        person1.name = "Vlad";
        person1.age = 50;

        PersonVAR person2 = new PersonVAR();
        person2.name = "Vova";
        person2.age = 21;

        //вызов методов
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();

        System.out.println("Первому человеку до пенсии " + year1 + " лет");
        System.out.println("Второму человеку до пенсии " + year2 + " лет");

    }
}

class PersonVAR {
    String name;
    int age;

    //метод возвращает значентие в метод main
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
        //после return ничего не исполняется в коде

    }

    //метод void - ничего не возвращает в метод main
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
