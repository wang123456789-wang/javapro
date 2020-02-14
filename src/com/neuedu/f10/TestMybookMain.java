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
        File file = new File("d:/books.tet");
        ArrayList<Mybook> books = new ArrayList<Mybook>(200);
        if(!file.exists()){
            System.out.println("首次执行");
            mybook.inputData(books);
            mybook.save(books);
        }else{
            mybook.read(books);
            mybook.menu(books);

        }



       /* print(list);
        addBook(list);
        print(list);*/
    }

}
