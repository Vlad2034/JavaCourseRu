import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Type something: ");
        int n = s.nextInt();
        //String string = s.nextLine();
        System.out.println("You typed - " + n);

    }
}
