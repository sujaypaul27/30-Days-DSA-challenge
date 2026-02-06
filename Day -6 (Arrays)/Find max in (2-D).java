import java.util.*;
class Main {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4,5,6,7,0},
            {9,8,7,6,5,4,3,2}
        };
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)//for accesessing the row legth we use[i]
            {
            if(arr[i][j]>max)
            {
                max=arr[i][j];
            }
                
            }
        }
        System.out.println(max);
    }
}