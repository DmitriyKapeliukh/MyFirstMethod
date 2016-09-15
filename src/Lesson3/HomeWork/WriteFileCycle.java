package Lesson3.HomeWork;
import java.io.*;

/**
 * Created by Dmytro_Kapeliukh on 9/15/2016.
 */
public class WriteFileCycle {
    public static void main(String[] args) throws IOException {
        File HelloWorldCycle = new File("/Users/Dmytro_Kapeliukh/Dropbox/HelloWorldCycle.txt");
        //File HelloWorldCycle = new File("D:\\Dropbox\\HelloWorldCycle.txt");
        OutputStream outputStream = new FileOutputStream(HelloWorldCycle);
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);
        for (int i = 0; i <= 100; i++) {
            writer.write(" " + String.valueOf(i));
        }
        writer.close();
    }
}
