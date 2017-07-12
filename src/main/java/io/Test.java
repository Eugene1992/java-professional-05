package io;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        printD(new File("src\\main\\java\\io\\A"));
    }

    static void print(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        } else {
            for (File child : file.listFiles()) {
                print(child);
            }
        }
    }

    static void printD(File file) {
        if (file.isDirectory()) {
            System.out.println(file.getName());
            for (File child : file.listFiles()) {
                if (child.isDirectory()) {
                    print(child);
                }
            }
        }
    }
}
