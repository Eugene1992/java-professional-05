package io;

import java.io.*;

public class SimpleCopy {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("src\\main\\java\\io\\source.txt");
            outputStream = new FileOutputStream("src\\main\\java\\io\\destination.txt");

            while (inputStream.available() > 0) {
                int aByte = inputStream.read();
                outputStream.write(aByte);
            }

            inputStream.close();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
