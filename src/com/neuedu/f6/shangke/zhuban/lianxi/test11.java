package com.neuedu.f6.shangke.zhuban.lianxi;

public class test11 {
    public static void main(String[] args) {
        int m = 0;
        for(int i = 101;i<=200;i++){

            boolean flag = true;
            for(int j = 2;j<i;j++){
                if(i%j == 0){
                    flag = false;
                   break;
                }
            }
            if(flag==true){
                System.out.println(i);
                m++;


            }

        }
        System.out.println(m);

    }

}
