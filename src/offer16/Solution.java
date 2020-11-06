package offer16;

public class Solution {
    public static double myPow(double x,int n){
        if(n < 0){
            return power(1/x,-n);
        }
        return power(x,n);
    }

    public static  double power(double x, int n) {
        if(n == 0){
            return 1;
        }

        double res = power(x,n/2);

        if((n & 1)== 0){
            return res * res ;
        }else{
            return res * res* x;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(3,4));

    }

}

