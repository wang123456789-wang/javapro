package f21;

import java.io.File;

public class test {
    public static void main(String[] args) {
//        Service service = new Service();
//        t1.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Client c = new Client();
        c.start();
        Service s = new Service();
        s.start();
    }
}
