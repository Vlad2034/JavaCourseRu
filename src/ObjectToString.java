public class ObjectToString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);

        Hum human = new Hum("Bob", 40);
        System.out.println(human); // result is Hum@65ab7765 это Object
        human.toString(); //toString returns hash code
        System.out.println(human.toString()); // одно и тоже System.out.println(human)
        // потому что toString скрыт и присутствует по умолчанию и скрыт
        // достался от класса Object
    }
}

//все классы наследуют от класса Object - если создается Object
class Hum {
    private String name;
    private int age;

    public Hum(String name, int age){
        this.name = name;
        this.age = age;
    }
    //меняет-переопределяем метод toString от родительского класса Object
    public String toString(){
        return name + ", " + age;  // result is NOW Bob, 40
    }

}
