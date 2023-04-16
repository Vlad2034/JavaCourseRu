public class StringBuilder {
    public static void main(String[] args) {
//        // type String immutable не изменяется до конца программы
//        String x = "Hello";
//        // не забываем что это создание объекта т.к. линия 4 это все равно что линия 6
//        //String x = new String("Hello");
//
//        x.toUpperCase(); //не будет работать
//        //ошибка потому что - все операторы String не оперрирует на строке где они вызываются
//        //они возвращают новую строку которая является результатом выполненой этого метода
//        //поэтому нужно переопределить значение х
//        x = x.toUpperCase(); //будет работать
//        System.out.println(x);

        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1 + string2 + string3;
        // сперва concatenate string1 and string2 образуя дополнительную третью строку
        // потом третья строка объединяется со string3 образуя другая дополнительная строка
        // в итоге образуется две дополнительные строки - чем больше их тем медленее работы кода
        // что-бы убрать это и придумали StringBuilder
        System.out.println(stringAll);

        // String Builder - mutable
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        sb.append(" my").append(" friend"); //method chaining
        System.out.println(sb.toString());




        //        // через сеттеры мы можем менять значение
        //
        //        HumanSt11 h1111 = new HumanSt11("Bob", 40);
        //        HumanSt11 h2222 = new HumanSt11("Tom", 30);
        //        h2222.setName("Vlad");
        //        h2222.setAge(35);
        //        h1111.printNumberOfPeople();
        //        h2222.printNumberOfPeople();
        //        HumanSt11 h3333 = new HumanSt11("Rob", 50);
        //        h1111.printNumberOfPeople();
        //        h2222.printNumberOfPeople();
        //        h3333.printNumberOfPeople();
        //
        //    }
        //}
        //class HumanSt11 {
        //    private String name;
        //    private int age;
        //    public static int countPeople;
        //
        //
        //    public HumanSt11 (String name, int age) {
        //        this.age = age;
        //        this.name = name;
        //        countPeople++;
        //    }
        //
        //    public void setName(String name) {this.name = name;}
        //    public String getName() {return name;}
        //    public void setAge(int age) {this.age = age;}
        //
        //    public void printNumberOfPeople(){
        //        System.out.println("Number of people = " +countPeople);
        //    }
    }
}
