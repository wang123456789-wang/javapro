package f12;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        int m = 0;
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"线程正在运行"+i);
            m++;
        }
        System.out.println(m);
    }
}
