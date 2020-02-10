package com.neuedu.f5.lianxi;

public class test {
    public static void main(String[] args) {
        Shape re = new Rectangle(3.0,5.0,"红色");         //引用父类指向子类对象 对属性赋值
        re.showAll();
        //要想输出先设置宽，高，半径 ，颜色



        Shape ci = new Circle(3.0,"蓝色");           //引用父类指向子类对象 对属性赋值
        ci.showAll();
    }
}
