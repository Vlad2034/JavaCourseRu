public class StaticKeyWord2 {
    public static void main(String[] args) {
        // static методы и переменные нужны если
        // 1. если методу не нужно знать переменные объекты
        // например: метод Math - там много статических методов
        // к которым мы можем получить доступ не создавая объекта
        System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);

        // с static мы используют только одну и туже область памяти.ячейку
        // в противном случае одно и тоже значение будет копироваться для каждого объекта
        // а это растрата памяти

        HumanSt1 h111 = new HumanSt1("Bob", 40);
        HumanSt1 h222 = new HumanSt1("Tom", 30);
        HumanSt1 h333 = new HumanSt1("Bill", 50);

        h111.printNumberOfPeople();
        h222.printNumberOfPeople();
        h333.printNumberOfPeople();

//        HumanSt1.description = "Nice"; //не надо создавать объект класса HumanSt1
//        // мы получаем прямой доступ к переменной
//        h111.getAllFields();
//        h222.getAllFields();
//        HumanSt1.description = "Bad";
//        h111.getAllFields();
//        h222.getAllFields();


//       HumanSt1 h111 = new HumanSt1("Bob", 50);
//       h111.description = "Bad";
        //doesn't work
    }
}
class HumanSt1 {
        //переменные объекта - они могут быть только у объекта и не могут быть у класса
        private String name;
        private int age;
        public static String description; //статическая переменная принадлежит классу HumanSt1
        // а не объекту. Она будет делиться между объектами этого класса

        public static int countPeople; //zero по умолчанию


        public HumanSt1 (String name, int age) {
            this.age = age;
            this.name = name;
            countPeople++;
        }

        // методы объекта
        public void setName(String name) {this.name = name;}
        public String getName() {return name;}
        public void setAge(int age) {this.age = age;}

        public static void getDescription(){
            System.out.println(description);
        }

        public void getAllFields(){
            System.out.println(name + ", " + age + ", " + description);
        }

//        public static void printAllFields(){
//            System.out.println(name);
//        } //static не может работать с изменяющимися значениями объекта, потому что
            // они разные у каждого объекта

        public void printNumberOfPeople(){
            System.out.println("Number of people = " +countPeople);
        }
}



