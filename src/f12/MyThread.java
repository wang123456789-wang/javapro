package f12;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"线程正在进行-----"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
