package com.neuedu.f4;

public class oushu {
    //输出1~100之间的所有偶数和
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i<=100;i++){
            if(i%2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
