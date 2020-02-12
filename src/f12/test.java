package f12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(12);
        student.setId(15);
        student.setName("张三");
        student.setSex("男");
        File file = new File("d:/Student");
        try {
            file.createNewFile();
            OutputStream outputStream = new FileOutputStream(file);
            int[] a = {student.getId(),student.getAge()};
            System.out.println(a[0]);
            //outputStream.write(a);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
