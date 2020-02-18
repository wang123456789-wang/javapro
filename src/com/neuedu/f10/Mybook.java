package com.neuedu.f10;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Mybook implements java.io.Serializable {
    private  static final long serializable = 1L;
    public String name;
    private double price;
    private String press;//出版社
    private String auter;
    private String bookISBN;//书的ISBN号
    public Mybook(){}
    public Mybook(String name, double price, String press, String auter, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.auter = auter;
        this.bookISBN = bookISBN;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getPress() {
        return press;
    }

    public String getAuter() {
        return auter;
    }

    public String getBookISBN() {
        return bookISBN;
    }
    @Override//重写toString函数，使输出的不是地址而是数组的信息
    public String toString() {
        return "图书名是" + name + "价格是" + price +"出版社是"+press +"作者是"+auter+"书的ISBN号"+bookISBN;
    }


}
