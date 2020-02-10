package com.neuedu.f5.lianxi;

public class Circle extends Shape {
    public double radius;       //半径属性

    @Override                   //对父类抽象方法getPer()的重写
    public double getPer() {
        per = 2*3.14*radius;
        return per;
    }

    @Override                   //对父类抽象方法showAll()的重写
    public double getArge() {
        arge = 3.14*radius*radius;
        return arge;
    }

    @Override                     //默认构造函数
    public void showAll() {
        System.out.println("圆的面积等于:"+getArge()+"  圆的周长等于:"+getPer()+"  圆的颜色是:"+color);

    }
    public Circle(){             //默认构造函数

    }
    public Circle(double radius,String color){      //对半径，颜色赋值的构造函数
        this.radius = radius;
        this.color = color;
    }

}
