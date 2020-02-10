package com.neuedu.f4;

public class shuixianhua {
    public static void main(String[] args) {
        //要求输出100~999之间所有水仙花数
        //思路：首先取到100~999之间所有数，再将水仙花数输出
        int i,a,b,c;
        int d = 0;
        for(i = 1;i<10;i++){
            for(a = 0;a<10;a++){
                for(b = 0;b<10;b++){
                    c = i*100+a*10+b;
                    //选择水仙花数输出
                    if(c == Math.pow(i,3)+Math.pow(a,3)+Math.pow(b,3)){
                        d++;
                        System.out.println(c);
                    }

                }
            }

        }
        System.out.println(d);
    }
}
