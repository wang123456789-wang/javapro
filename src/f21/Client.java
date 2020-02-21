package f21;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {

    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
            //OutputStream outputStream = null;
            try {
            Socket socket = new Socket("127.0.0.1", 9846);
            System.out.println("客户端连接");
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(outputStream);
            while (true) {
                System.out.print("客户端说：");
                String str = scanner.nextLine();
                pw.println(str);
                pw.flush();
                Thread.sleep(500);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
             /*finally {
                try {
                    if (printStream != null)
                        printStream.close();
                    if (outputStream != null)
                        outputStream.close();
                    if (socket != null)
                        socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }*/





}
