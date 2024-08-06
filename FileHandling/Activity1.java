package FileHandling;

import java.io.*;
public class Activity1{
    public static void main(String[] args) {
        
        try {
            char [] ch = {'j','a','v','a'};
            OutputStream os = new FileOutputStream("test.txt");
            for (int i = 0; i < ch.length; i++) {
            os.write(ch[i]);
        }
        os.close();

        InputStream is = new FileInputStream("test.txt");
        int data = is.read();
        while (data!= -1) {
            System.out.print((char)data);
            data = is.read();
        }
        is.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}