package com.neuedu.f10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {
    Scanner input = new Scanner(System.in);
    public void inputData(List<Mybook> books){
        //从键盘上输入n本书的信息

        System.out.println("输入要输入的书本个数");
        int num = input.nextInt();
        for ( int n=1 ; n<=num;n++){
            System.out.println("name");
            String name = input.next();
            System.out.println("price");
            double price = input.nextDouble();
            System.out.println("press");
            String press = input.next();
            System.out.println("auter");
            String auter = input.next();
            System.out.println("bookISBN");
            String bookISBN = input.next();
            books.add(new Mybook(name,price,press,auter,bookISBN));
            System.out.println("当前拥有的图书信息为：");
            System.out.println(books);
        }

    }

    public void print(List<Mybook> books){
        if(books.size()==0) {
            System.out.println("没有图书");
        }else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i));
            }
        }
    }


    public void searchName(List<Mybook> books){//在程序1的基础上，增加查找功能，
        boolean flag = true;
        System.out.println("请输入要查找的图书名");
        String name2 = input.next();
        for(int i = 0;i<books.size();i++){
            if(name2.equals(books.get(i).getName())){
                System.out.println("查找成功该书信息为");
                System.out.println(books.get(i));
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("查找失败，没有该图书");
        }
    }

    public void deleteName(List<Mybook> books,File file){//根据书名查找图书并删除该图书
        boolean flag = true;
        System.out.println("请输入你要删除的图书的图书名");
        String name2 = input.next();
        boolean flag1 = true;
        for(int i = 0;i<books.size();i++){
            if(name2.equals(books.get(i).getName())){
                books.remove(i);
                System.out.println("删除图书成功，剩余图书信息为：");
                print(books);
                flag1 = false;
                break;
            }
        }
        if(flag1){
            System.out.println("删除失败，没有该图书");
        }

    }

    public void menu(List<Mybook> books,File file){
        boolean flag = true;
        while (flag){
            System.out.println("请选择你要进行的操作（请输入1-4中的任一个数字）：当用户输入1-3时，分别调用输入、删除和查找函数，当用户输入4时程序结束");
            Scanner scanner = new Scanner(System.in);
            int shu = scanner.nextInt();

            switch (shu){
                case 1:
                    System.out.println("1：添加图书");
                    inputData(books);
                    save(books,file);
                    break;
                case 2:
                    System.out.println("2：删除图书");
                    deleteName(books,file );
                    save(books,file);
                    break;
                case 3:
                    System.out.println("3：查找图书（根据图书名）");
                    searchName(books);
                    break;
                case 4:
                    System.out.println("4：输出图书信息");
                    read(file);
                    print(books);
                    break;
                case 5:
                    System.out.println("5：退出当前用户");
                    //                String stop = input.next();
                    //                String str = input.nextLine();
                    System.out.println("提示信息：当前用户已退出，请重新登陆");
                    flag = false;
                    break;

                default:
                    break;
            }

        }
    }

    public static void save(List<Mybook> books,File file){
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(books);
            oos.flush();
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos!=null)
                    oos.close();
                if(os!=null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public  List<Mybook> read(File file){
        InputStream is  = null;
        ObjectInputStream ois = null;
        List<Mybook> books = new ArrayList<>();
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            books = (ArrayList<Mybook>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ois!=null)
                    ois.close();
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return books;
    }

}
