public class ThisWordGetSet {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(18);
        human.setName("Tom");

        Human human1 = new Human();
        human1.setAge(25);
        human1.setName("John");

        human.getInfo();
        human1.getInfo();
    }
}
class Human {
    String name; //name принадлежит объекту или класса
    int age;

    public void setName(String name) { //name принадлежит методу
        // метод берет ближайшее name (метода) и присваивает значение name метода - абсурд
        // поэтому используется this что указывает на name объекта или класса
        // this вызывает объект внутри класса
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}


