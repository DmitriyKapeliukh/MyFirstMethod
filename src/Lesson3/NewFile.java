package Lesson3;

import java.io.*;

/**
 * Created by Dmytro_Kapeliukh on 9/13/16.
 */
public class NewFile {
    public static void main(String[] args) throws IOException {
        File textfile = new File("/Users/Dmytro_Kapeliukh/Documents/NewFile.txt");
        if (textfile.exists()) {
            System.out.println("File exist");
        }

        else {
            textfile.createNewFile();
        }

        OutputStream outputStream = new FileOutputStream(textfile);
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);

        writer.write("I have this string into file!\n");
        writer.append("New string\n");

        writer.close();

        FileWriter fWrite = new FileWriter(textfile,true);
        for (int i = 0; i<10; i++) {
            fWrite.append("one new string\n");
        }
        fWrite.close();

    }
}
