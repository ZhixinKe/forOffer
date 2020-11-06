package offer16;

public class Solution {
    //递归
    public static double myPow(double x,int n){
        if(n < 0){
            return power(1/x,-n);
        }
        return power(x,n);
    }

    public static  double power(double x, int n) {
        //递归的终止条件
        if(n == 0){
            return 1;
        }
        //保存结果
        double res = power(x,n/2);

        //判断n的正负，当n为奇数时，需要多乘一个底数
        if((n & 1)== 0){
            return res * res ;
        }else{
            return res * res* x;
        }
    }

    /*

     */

    //非递归
    public static double myPow2(double x,int n){
        long b = n;
        if(b < 0){
            b = -b;
            x = 1/x;
        }
        double res = 1.0;
        while(b > 0){
            if((b & 1)==1){
               res *= x;
            }
            x *= x;
            b = b>>1;
        }
        return res;

    }

    public static void main(String[] args) {
       // System.out.println(myPow(3,4));
        System.out.println(myPow2(3.0,4));

    }

}

