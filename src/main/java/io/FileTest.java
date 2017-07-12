package io;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\io\\source.txt");

        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        File[] list = new File("src\\main\\java\\io").listFiles();
        for (File f : list) {
            System.out.println(f.getName());
        }
    }
}
