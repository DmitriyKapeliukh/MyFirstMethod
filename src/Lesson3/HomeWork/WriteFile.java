package Lesson3.HomeWork;

import java.io.*;

/**
 * Created by Dmytro_Kapeliukh on 9/15/2016.
 */
public class WriteFile {
    public static void main(String[] args) throws IOException {
        File HelloWorld = new File("D:\\Dropbox\\HelloWorld.txt");
        if (HelloWorld.exists())
        {
            System.out.println("File already exist");
        }
        else {
            HelloWorld.createNewFile();
        }

        OutputStream outputStream = new FileOutputStream(HelloWorld);
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);
        writer.write("Hello, World!");

        writer.close();

    }
}