package com.neuedu.f6.shangke;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
//        List arraylist = object
          List list = new ArrayList();
          list.add(1);
          list.add(2);
          list.add("dfskjdshf");
          list.add(0,"ninnjklnkl");
          for(int i = 0;i<list.size();i++){
              System.out.println(list.get(i));
          }
        System.out.println("判断list中是否有这个数有返回true，没有返回false ：  "+list.contains(5));

    }

}
