package com.neuedu.f4;

public class ncifang {
        public static void main(String[] args) {
            //给定俩个数m，n  输出m^n
            int m=2;
            int n=3;
            int sum = 1;
            for(int i = 1;i<=n;i++){
                sum = m*sum;
            }
            System.out.println(sum);
        }

}
