package offer16;

public class Solution {
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

    public static void main(String[] args) {
        System.out.println(myPow(3,4));

    }

}

