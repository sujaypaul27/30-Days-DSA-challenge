class Solution {
    public  int sumofsq(int n)
    {
        int sum =0;
        while(n>0){//123
            int d=n%10;//3
            sum=sum+(d*d);//9
            n=(int)n/10;//12
        }
        return sum;
    }
    public boolean isHappy(int n) {//19
        HashSet<Integer> set =new HashSet<>();//to store the numbers which we have already seen
        while(n!=1 && !set.contains(n)){//if n is not 1 and we have not seen n befor/e
            set.add(n);//add n to the set
            n=sumofsq(n);//replace n with the sum of squares of its digits
        }
        if(n!=1){//if n is not 1, it means we have seen n before and we are in a loop
            return false;//so n is not a happy number
        
        } else{
            return true;//if n is 1, it means we have found a happy number
        }
    }
}