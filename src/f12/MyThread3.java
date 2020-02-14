package f12;

public class MyThread3 extends Thread {
    private int count = 40;

    @Override
    public void run() {
        while(count>0){
            System.out.println(Thread.currentThread().getName()+"卖出了"+count+"张票");
            count--;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
