import java.util.*;
class Main {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4,5,6,7,0},
            {9,8,7,6,5,4,3,2}
        };
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)//length of col array
        {
            for(int j=0;j<arr[i].length;j++)//[i]length because we want to check the length of the row array
            {
            if(arr[i][j]<min)
            {
                min=arr[i][j];
            }
                
            }
        }
        System.out.println(min);
    }
}