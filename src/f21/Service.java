package f21;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Service extends  Thread {
    public void run(){
        try {
            ServerSocket serverSocket = new ServerSocket(9846);
            Socket socket = serverSocket.accept();
            System.out.println("客户端已连接");
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println("asdasdasd");
            while(true){
                String str = bufferedReader.readLine();
                System.out.println("服务端说："+str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//        Socket socket =null;
//        InputStream inputStream =null;
//        InputStreamReader inputStreamReader =null;
//        BufferedReader bufferedReader =null;
       /*finally {
            try {
                if(bufferedReader!=null)
                    bufferedReader.close();
                if(inputStreamReader!=null)
                    inputStreamReader.close();
                if(inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }


