package com.neuedu.f6.shangke.zhuban.lianxi;

public class one {
    public static void main(String[] args) {
         String a = "abc";   //此时传的是地址    这种写法代表的是a 指向字符串常量值 abc这个字符串中
         method(a);
        System.out.println(a);
    }
    public static void method(String a){
        a = "fsdklfdjs";
    }
}
