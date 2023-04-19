public class ArraysMulti {
    public static void main(String[] args) {

        int[] arrInt = {1, 2, 3};
        System.out.println(arrInt[1]);
        System.out.println();


        int[][] arr2D = {{1, 2},
                         {3, 4, 5, 6},
                         {7, 8, 9, 10, 11} };


        for(int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]);
            }
            System.out.println();
        }
    }
}
