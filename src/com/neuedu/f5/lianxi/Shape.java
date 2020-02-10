package com.neuedu.f5.lianxi;

public abstract class Shape {
    public double arge;     //面积属性
    public double per;      //周长属性
    public String color;    //颜色属性
    public Shape(){         //默认构造方法

    }
    public Shape(String color){     //为颜色赋值的构造方法
        this.color = color;
    }
    //获取面积，颜色，展示全部的构造方法
    public abstract double getArge();
    public abstract double getPer();
    public abstract void showAll();


}
