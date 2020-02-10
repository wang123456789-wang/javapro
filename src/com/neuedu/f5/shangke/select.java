package com.neuedu.f5.shangke;

public class select {
    public static void main(String[] args) {
        int[] array = {10,1,2,15,25,16,35,100,60,40,88,56};
        for(int i = 0;i<array.length-1;i++){
            for(int j = i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int a;
                    a = array[j];
                    array[j] = array[i];
                    array[i] = a;
                }

            }
        }
        for(int b:array)
        System.out.println(b);
    }
}
