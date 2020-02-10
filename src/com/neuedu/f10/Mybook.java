package com.neuedu.f10;

import java.util.ArrayList;
import java.util.Scanner;

//包括成员name（书名String）、price（价格 double）、press（出版社String）、author（作者 String）、bookISBN（书的ISBN号String），
// 定义一个类数组mybook books[200]，编写一个函数inputData(ArrayList<Mybook> books])，n为书的数量，从键盘上输入n本书的信息，
// 编写一个函数print(ArrayList<Mybook> books)，输出全部书的信息。
// 程序2 在程序1的基础上，增加查找功能，
// 编写函数searchName(ArrayList<Mybook> books,String name)，根据书名name在数组books中查找是否存在此书，
// 如果能找到，输出该书的详细信息，
// 如果找不到，输出“此书不存在”。
// 程序3 增加删除功能，编写函数deleteName(ArrayList<Mybook> books,String name)，根据书名name在数组books中查找是否存在此书，
// 如果存在，删除该书，并提示“此书删除成功。 ”，并显示该书的详细信息。
// 如果不存在，输出“没有此书，删除失败.”
// 程序4 添加函数menu()，输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：
// 1：添加图书2：删除图书3：查找图书（根据用户名）4：退出当用户输入1-3时，分别调用输入、删除和查找函数，当用户输入4时程序结束。
public class Mybook {
    public String name;
    private double price;
    private String press;//出版社
    private String auter;
    private String bookISBN;//书的ISBN号
    ArrayList<Mybook> books = new ArrayList<Mybook>(200);
    public Mybook(){}
    Scanner input = new Scanner(System.in);
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

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuter() {
        return auter;
    }

    public void setAuter(String auter) {
        this.auter = auter;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public void inputData(ArrayList<Mybook> books){            //从键盘上输入n本书的信息
//        for (int n=0 ; n<books.size()-1;n++){，

//            Scanner price = new Scanner(System.in);
//            Scanner press = new Scanner(System.in);
//            Scanner auter = new Scanner(System.in);
//            Scanner bookISBN = new Scanner(System.in);
//        }

        System.out.println("输入要输入的书本个数");
            int num = input.nextInt();
        for ( int n=1 ; n<=num;n++){
            System.out.println("name");
            name = input.next();
            System.out.println("price");
            price = input.nextDouble();
            System.out.println("press");
            press = input.next();
            System.out.println("auter");
            auter = input.next();
            System.out.println("bookISBN");
            bookISBN = input.next();
            books.add(new Mybook(name,price,press,auter,bookISBN));
            System.out.println("当前拥有的图书信息为：");
            System.out.println(books.toString());
        }

    }
    @Override
    public String toString() {
        return "图书名是" + name + "价格是" + price +"出版社是"+press +"作者是"+auter+"书的ISBN号"+bookISBN;
    }
    public void print(ArrayList<Mybook> books){//输出全部书的信息。
        for(int i =0;i<books.size();i++){
            System.out.println(books.get(i));
        }
    }


    public void searchName(ArrayList<Mybook> books){//在程序1的基础上，增加查找功能，
        boolean flag = true;
        System.out.println("请输入要查找的图书名");
        String name2 = input.next();
//        for(Object i:books){
//            if(i == name2){
//                books.remove(i);
//                System.out.println("此书删除成功。");
//                System.out.println(i);
//                flag = false;
//            }else if(flag){
//                System.out.println("没有此书，删除失败。");
//            }
//        }      for
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

    public void deleteName(ArrayList<Mybook> books){//根据书名查找图书并删除该图书
        boolean flag = true;
        System.out.println("请输入你要删除的图书的图书名");
        String name2 = input.next();
//        for(Object i:books){
//            if(i == name2){
//                books.remove(i);
//                System.out.println("此书删除成功。");
//                System.out.println(i);
//                flag = false;
//            }else if(flag){
//                System.out.println("没有此书，删除失败。");
//            }
//        }      for
        boolean flag1 = true;
        for(int i = 0;i<books.size();i++){
            if(name2.equals(books.get(i).getName())){
                books.remove(i);
                System.out.println("删除图书成功，剩余图书信息为：");
                System.out.println(books);
                flag1 = false;
                break;
            }
        }
        if(flag1){
            System.out.println("删除失败，没有该图书");
        }

    }

    public void menu(){
        boolean flag = true;
        while (flag){
        System.out.println("请选择你要进行的操作（请输入1-4中的任一个数字）：当用户输入1-3时，分别调用输入、删除和查找函数，当用户输入4时程序结束");
        Scanner scanner = new Scanner(System.in);
        int shu = scanner.nextInt();

        switch (shu){
            case 1:
                System.out.println("1：添加图书");
                inputData(books);
                break;
            case 2:
                System.out.println("2：删除图书");
                deleteName(books);
                break;
            case 3:
                System.out.println("3：查找图书（根据图书名）");
                searchName(books);
                break;
            case 4:
                System.out.println("4：退出当前用户");
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
    // 程序4 添加函数menu()，输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：
    // 1：添加图书2：删除图书3：查找图书（根据用户名）4：退出当用户 输入1-3时，分别调用输入、删除和查找函数，当用户输入4时程序结束。
    public static void main(String[] args) {
        Mybook mybook = new Mybook();
        mybook.menu();
    }
}
