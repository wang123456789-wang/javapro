package f13;

import java.util.concurrent.CountDownLatch;

public class MyTest2 {
    public static int a = 0;
    public static void main(String[] args) {
        Object object = new Object();
//        int a = 0;
//        Thread t = new Thread(()->{
//            for(int i = 0;i<500;i++){
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+"线程输出"+i);
//
//            }
//        });
//        t.start();

        CountDownLatch m = new CountDownLatch(100000);  //定义锁的个数
        for (int i = 0; i <10000; i++) {
            Thread t = new Thread(
                 () -> {
                        synchronized (object) {         //定义锁旗标 当锁旗标被其他线程拿走时就阻塞在这里等待释放锁旗标
                        a++;
                        m.countDown();                 //开一次锁
                        }
                });
            t.start();                                  //执行线程

        }
        try {
            m.await();                                  //阻塞  当还有锁没有解开的时候就阻塞在这里
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }
}
