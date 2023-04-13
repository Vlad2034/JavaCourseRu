public class StaticKeyWord1 {
    public static void main(String [] args) {
        HumanSt h1 = new HumanSt("Bob", 30);
        h1.setName("Tom");
        System.out.println(h1.getName());
    }
}
class HumanSt {
    //переменные объекта - они могут быть только у объекта и не могут быть у класса
    private String name;
    private int age;

    public HumanSt (String name, int age) {
        System.out.println("привет из третьего конструктора");
        this.age = age;
        this.name = name;

    }

    // методы объекта
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


