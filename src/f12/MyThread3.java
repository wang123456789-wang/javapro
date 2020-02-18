package f12;

import com.sun.org.apache.xpath.internal.objects.XObject;

public class MyThread3 implements Runnable {
    private int count = 80;
    Object obj = new Object();
    @Override
    public void run() {
        while(count>0){
            synchronized(obj){
                System.out.println(Thread.currentThread().getName()+"卖出了"+count+"张票");
                count--;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public synchronized void add(){
        while(true){
            System.out.println(Thread.currentThread().getName()+"输出add");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void del(){
        while(true){
            System.out.println(Thread.currentThread().getName()+"输出del");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
