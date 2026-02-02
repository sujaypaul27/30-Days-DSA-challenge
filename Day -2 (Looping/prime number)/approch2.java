// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc =new Scanner (System.in);
       int num =sc.nextInt();
       
       boolean result=true;
       if(num==0 || num ==1)
       {
           result=false;
           
       }
       for(int i=2;i<=Math.sqrt(num);i++)
       {
           if(num%i==0)
           {
               
               result =false;
               break;
           }
       }
       
       if(result)
       {
           System.out.println("is Prime");
       }
       else
       {
           System.out.println("is Not a Prime");
       }
       
       
    }
}