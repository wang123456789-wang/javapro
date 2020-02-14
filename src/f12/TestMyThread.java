package f12;

public class TestMyThread {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//        MyThread t2 = new MyThread();
//        t2.start();
//        MyThread2 myThread2 = new MyThread2();
//        Thread t = new Thread(myThread2);
//        Thread t2 = new Thread(myThread2);
//        t.start();
//        t2.start();
//        MyThread3 myThread3 = new MyThread3();
//        Thread t = new Thread(myThread3);
//        Thread t1 = new Thread(myThread3);
//        t.start();
//        t1.start();
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        t1.start();
        t2.start();

    }
}
