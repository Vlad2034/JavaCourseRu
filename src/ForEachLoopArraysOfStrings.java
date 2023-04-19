public class ForEachLoopArraysOfStrings {

    public static void main(String[] args) {

        String[] arr1 = new String[3];
        arr1[0] = "hi";
        arr1[1] = "bye";
        arr1[2] = "java";

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println();

        //foreach loop
        for(String string:arr1){
            System.out.println(string);
        }

        int[] num1 = {1, 2, 3};
        int sum = 0;

        for (int x:num1){
            sum += x;
        }

        System.out.println();
        System.out.println(sum);

    }
}
