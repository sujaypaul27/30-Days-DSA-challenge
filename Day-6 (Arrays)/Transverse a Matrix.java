import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 4},
            {5, 6, 7}
        };

        int[][] arr2 = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[j][i] = arr[i][j];   // ✅ correct transpose
            }
        }

        System.out.println(Arrays.deepToString(arr2));
    }
}
