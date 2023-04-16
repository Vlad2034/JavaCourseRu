public class Strings {
    public static void main(String[] args) {
        int x = 5;
        //String - ссылочные типы данных - строки
        String s = "Hello"; //Hello это объект и s ссылается на этот объект
        //String - это класс поэтому начинается с большой буквы
        //String s = new String("Hello") - конструктор которого мы не видим = строке 4

        String space = " ";
        String name = "Bob";
        System.out.println(s + space + name);
        System.out.println("Hello" + " " + "John");
        System.out.println("My number is " + x);

        System.out.print(s + space + name);
        System.out.print("Hello" + " " + "John");
        System.out.print("My number is " + x);

        System.out.println();
        System.out.printf("This is a string, %s", "NICE"); // вставка стринга %s - string

        System.out.println();
        System.out.printf("This is a string, %d", 10);// вставка wbahs %d - digit

        System.out.println();
        System.out.printf("%fThis is %s a string, %d", 10.4, "HIHI", 10000);// мильти вставка

        //форматирование строки
        System.out.println("\n Цыфры справа налево");
        System.out.printf("String %10d \n", 532); // число шириной 10 символов
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 1000000000);

        System.out.println("\n По умолчанию");
        System.out.printf("String %d \n", 532);
        System.out.printf("String %d \n", 5);
        System.out.printf("String %d \n", 100000);
        System.out.printf("String %d \n", 1000000000);

        System.out.println("\n Цыфры слева направо");
        System.out.printf("String %-10d \n", 532);
        System.out.printf("String %-10d \n", 5);
        System.out.printf("String %-10d \n", 100000);
        System.out.printf("String %-10d \n", 1000000000);

        System.out.println("\n Ограничение цифр после запятой с округлением");
        System.out.printf("String %.2f \n", 45.32265);
        System.out.printf("String %.2f \n", 45.32);
        System.out.printf("String %.2f \n", 45.123456);
        System.out.printf("String %.2f \n", 45.987456432);

        // % -[10][.42]
    }
}
