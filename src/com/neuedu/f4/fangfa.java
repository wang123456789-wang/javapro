package com.neuedu.f4;

public class fangfa {
    private int  a;
    public int yueShu(int a) {

        for(int i = 1;i<=a;i++){
            if(a%i==0){
                i++;
            }
        }
        return a;
    }
}
