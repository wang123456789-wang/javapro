package com.neuedu.f5.lianxi;

public class Rectangle extends Shape {   //矩形类
    public double width;          //宽属性
    public double height;         //高属性

    @Override                     //对父类抽象方法getArge()的重写
    public double getArge() {
        arge = width*height;
        return arge;
    }

    @Override                     //对父类抽象方法getPer()的重写
    public double getPer() {
        per = 2*(width+height);
        return per;
    }

    @Override                    //对父类抽象方法showAll()的重写
    public void showAll() {
        System.out.println("矩形的面积等于:"+getArge()+"  矩形的周长等于:"+getPer()+"  矩形的颜色是："+color);
    }
    public Rectangle(){          //默认构造函数

    }
    public Rectangle(double height,double width,String color){        //对高,宽,颜色,赋值的构造函数
        super();
        this.height = height;
        this.width = width;
        this.color = color;
    }

}
