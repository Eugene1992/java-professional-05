package cw05;

import java.io.File;

/**
 * Created by Ярик on 12.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        print(new File("yaroslav\\src\\main\\java\\cw05\\b"));
        System.out.println("----------");
        printD(new File("yaroslav\\src\\main\\java\\cw05\\b"));
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

        static void printD(File file){
            if(file.isDirectory()){
                System.out.println(file.getName());
                for (File child:file.listFiles()) {
                    printD(child);
                }
            }
        }
    }

