package f12;

import java.io.*;

public class Ioliu {
    //把d下 某个文件 复制到  d:/a 下
    public static void main(String[] args) throws IOException {
        File file1 =new File("d:\\abc.txt");
        File file2 =new File("d:\\a","abc.txt");
        System.out.println("文件file1的大小"+file1.length()+"字节");
        OutputStream outputStream = null;
        InputStream inputStream = null;
        try {
            boolean boo =  file2.createNewFile();
            System.out.println("file2如果路径中有该文件 返回false 如果没有就开始创建："+boo);
            outputStream = new FileOutputStream(file2);

            inputStream = new FileInputStream(file1);
            byte[] a = new byte[10];
            int b = inputStream.read(a);
            while(b!= -1) {
                System.out.println("读取字节数:" + b);
                System.out.println(new String(a, 0, b));
                String str = new String(a, 0, b);
                outputStream.write(str.getBytes());
                outputStream.flush();
//                outputStream.close();
                b = inputStream.read(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(outputStream != null){
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
