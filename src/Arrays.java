public class Arrays {
    public static void main(String[] args) {
       int[] numbers = new int[5]; //0 1 2 3 4
       for(int i =0; i < numbers.length; i++){
            numbers[i] = i*10;
       }

        for (int i =0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println();

        int[] numbers1 = {1, 2, 3};
        for (int i =0; i < numbers1.length; i++){
            System.out.println(numbers1[i]);
        }

    }
}
