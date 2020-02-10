package com.neuedu.f4;

public class Mytext {
    public static void main(String[] args) {

//        dag d1 = new dag();
////        d1.setAge(1000);
//        System.out.println( d1.getAge());
//        d1.setSex('公');
//        System.out.println(d1.getSex());
//        int year = 1992;
//        if ((year % 4 == 0&&year %100 != 0)|| year % 400 == 0){
//            System.out.println("是闰年");
//        }else{
//            System.out.println("不是闰年");
//        }
//        int a=0;
//        for( int i = 1;i<=100;i++){
//            int sum = i;
//            a = sum+a;
//        }
//        System.out.println(a);
//        int i;
//        int a;
//        int sum = 0;
//        for(i = 2;i<=100;i++){
//            boolean flag = true;
//            for(a=2;a<=(int)Math.sqrt(i);a++){
//                if(i%a==0){
//                    flag = false;
//                    break;
//                }
//            }
//                 if(flag){
//                    sum = sum+i;
//
//                }
//        }
//
//        System.out.println(sum);

        int[] array = {1,2,3,4};

        int d=0;
        for(int i :array){
            for(int a :array){
                if(a != i){
                    for(int b :array){
                        if(b != a&&b != i){
                            int c = i*100+a*10+b;
                            d++;
                            System.out.println(c);}
                }}

            }
        }
        System.out.println(d);
   }
}
