package Lesson3.HomeWork;

import java.io.*;

/**
 * Created by Dmytro_Kapeliukh on 9/15/2016.
 */
public class WriteFileCycle2 {
    public static void main(String[] args) throws IOException {
        int varable = 0;
        File HelloWorldCycle = new File("D:\\Dropbox\\HelloWorldCycle2.txt");
        OutputStream outputStream = new FileOutputStream(HelloWorldCycle);
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);
        for (int i = 0; i <= 100; i++) {
            writer.write(" " + String.valueOf(varable+=i));
        }
        writer.close();
    }
}
