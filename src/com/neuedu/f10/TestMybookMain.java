package com.neuedu.f10;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TestMybookMain implements java.io.Serializable {
    private  static final long serializable2 = 2L;

    public static void main(String[] args) {
        Mybook mybook = new Mybook();
        Method method = new Method();
        List<Mybook> books = new ArrayList<Mybook>();
        File file = new File("d:/books.txt");
        if(!file.exists()){
            System.out.println("首次执行");
            method.inputData(books);
            method.save(books,file);
        }else{
            books =  method.read(file);
        }
        method.menu(books,file);



       /* print(list);
        addBook(list);
        print(list);*/
    }

}
