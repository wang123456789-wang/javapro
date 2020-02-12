package com.neuedu.f10;

import java.io.File;
import java.io.IOException;
public class TestMybookMain {


    public static void main(String[] args) {
        Mybook mybook = new Mybook();
        File file = new File("d:/book.txt");
        if(!file.exists()){
            System.out.println("首次执行");
            mybook.inputData(mybook.books);
            mybook.save();
        }else{
            mybook.menu();
            mybook.read();
        }



       /* print(list);
        addBook(list);
        print(list);*/
    }

}
