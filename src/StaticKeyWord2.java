public class StaticKeyWord2 {
   public static void main(String [] args) {
        HumanSt1.description = "Nice"; //не надо создавать объект класса HumanSt1
       // мы получаем прямой доступ к переменной
       HumanSt1.getDescription();
       HumanSt1.description = "Bad";

//       HumanSt1 h111 = new HumanSt1("Bob", 50);
//       h111.description = "Bad";
       //doesn't work
   }
class HumanSt1 {
        //переменные объекта - они могут быть только у объекта и не могут быть у класса
        private String name;
        private int age;
        public static String description; //статическая переменная принадлежит классу HumanSt1
        // а не объекту. Она будет делиться между объектами этого класса

        public HumanSt1 (String name, int age) {
            System.out.println("привет из третьего конструктора");
            this.age = age;
            this.name = name;
        }

        // методы объекта
        public void setName(String name) {this.name = name;}
        public String getName() {return name;}
        public void setAge(int age) {this.age = age;}

        public static void getDescription(){
            System.out.println(description);
        }
    }


}
