package com.neuedu.f5.shangke;

public class erfengfa {
    public static void main(String[] args) {
        int[] array = new int[1000];//定义一个空数组
        for(int i = 0;i<array.length;i++){    //为数组赋值
           array[i] = i+1;
        }
        int k=search(array,100);     //调用静态方法search()
        System.out.println(k);
    }
    //
    public static int search(int[] array,int b){
       int min = 0;
       int max = array.length-1;
       int mid ;
       int count=0;
       while (min<=max){
           count++;
           mid = (min+max)/2;
           if(b==array[mid]){
               System.out.println("运行了"+count+"次");
               return mid;
           }else if(array[mid]<b){
               min = mid-1;
           }else{
               max = mid+1;
           }
       }
        return -1;
    }
}
