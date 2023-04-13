public class Constructor {
    public static void main(String [] args) {
        HumanC human1 = new HumanC();
        // constructor - это особый метод который вызывается при создании объекта
        // когда видишь new значит вызывается конструктор
        HumanC human2 = new HumanC("Bob");
        HumanC human3 = new HumanC("Bob", 25);


    }
}
class HumanC {
    private String name;
    private int age;


    //public HumanC(){
    // }
    // это constructor by default и мы его не видим
    // но можем написать свой конструктор и использовать для чего нибудь
    // constructor метод не имеет типа возвращаемого значения (void or int)
    // имя constructor должно совпадать с именем класса и только с большой буквой


    // перегрузка методов - overwrite
    public HumanC() {
        System.out.println("привет из первого конструктора");
        this.name = "Имя по умолчанию";
        this.age = 0;
    }
    public HumanC (String name) {
        System.out.println("привет из второго конструктора");
        this.name = name;
    }
    public HumanC (String name, int age) {
        System.out.println("привет из третьего конструктора");
        this.age = age;
        this.name = name;
    }
    // конец перегрузки методов

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
