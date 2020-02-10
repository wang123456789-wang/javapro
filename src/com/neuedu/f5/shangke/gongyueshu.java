package com.neuedu.f5.shangke;

public class gongyueshu {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int max=1;
        int min=1;
        //计算最大公约数
        for(int i = 1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                max=i;
            }
        }
        //计算最小公倍数
        for(int j=(a>b)?a:b;j<a*b;j++){
            if(j%a==0&&j%b==0){
                min = j;
                break;
            }
        }
        System.out.println(a+"与"+b+"最大公约数是"+max);
        System.out.println(a+"与"+b+"最小公倍数数是"+min);
//        public int max(int a , int b){
//            if(a>b){
//
//            }
//
//        }
    }
}
