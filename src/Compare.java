import com.sun.org.apache.xpath.internal.objects.XObject;

import java.sql.Time;
import java.util.*;

public class Compare {
    public static void main(String[] args) {
        /*
        *
        * 分别用arraylist和linklist添加元素  测试俩者性能差别
        * 首部添加元素时linklist性能是arrayliat的百倍
        * 在尾部添加元素时linklist性能与arraylia几乎相同
        * 在读取元素时arrayliat性能是linklist性能的千倍
        *   arraylist在给首部添加元素时用的时间是：456
            linklist在给首部添加元素时用的时间是：6
            arraylist在读取元素时用的时间是：2
            linklist在读取元素时用的时间是：3437
        *
        * */
        List arraylist = new ArrayList();
        List linklist = new LinkedList();
        //首部添加元素
        Date startarraylist = new Date();
            for(int i = 0;i<100000;i++){
                arraylist.add(0,i);//在首部添加元素
            }
        Date endarraylist = new Date();
        //首部添加元素
        Date startlinklistt = new Date();
            for(int i = 0;i<100000;i++){
                linklist.add(0,i);//在首部添加元素
            }
        Date endlinklist = new Date();
            //arraylist读取元素
        Date startreadarraylist = new Date();
        for(int i = 0;i<arraylist.size();i++){
            Object object = arraylist.get(i);
        }
        Date endreadarraylist = new Date();
        //linklist读取元素
        Date startreadlinklist = new Date();
        for(int i = 0;i<linklist.size();i++){
            Object object = linklist.get(i);
        }
        Date endreadlinklist = new Date();
        System.out.println("arraylist在给首部添加元素时用的时间是："+(endarraylist.getTime()-startarraylist.getTime()));
        System.out.println("linklist在给首部添加元素时用的时间是："+(endlinklist.getTime()-startlinklistt.getTime()));
        System.out.println("arraylist在读取元素时用的时间是："+(endreadarraylist.getTime()-startreadarraylist.getTime()));
        System.out.println("linklist在读取元素时用的时间是："+(endreadlinklist.getTime()-startreadlinklist.getTime()));
    }
}
