import java .util.*;
class Main{
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the tot number of values and enter the values 1 by 1 : ");
        int n=sc.nextInt();
        int[] input =new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();//getting input
        }
        System.out.println("Enter the target value: ");
        int target=sc.nextInt();
        int left=0;
        int right=n-1;
        int answer=-1;//coz at first we dont know the answer
        while(left<=right){//<= because we even need to check mid element
         
         int mid =left+(right-left)/2; //this because (left+right)/2 works but in larger test case it may exceedf int max values  
         if(input[mid]==target){
             answer=mid;
             break;
             
         }else if(input[mid]<target){
             left=mid+1;//because sure it wont we less than since sorted
         }else{
             right=mid-1;//other case it would be higher so we need to reduce element
         }
        }
        System.out.println("target found at position: "+(answer+1)+"   target found at index: "+(answer));// if we need position and not index use this 
    }
} 