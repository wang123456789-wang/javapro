package com.neuedu.f5.shangke;

public class maopao {
    public static void main(String[] args) {
        int[] array = {10,1,2,15,25,16,35,100,60,40,88,56};
        for(int i = 0 ;i<array.length-1;i++){
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int a;
                    a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;
                }
            }
        }
        for (int b:array)
        System.out.println(b);
    }
}
