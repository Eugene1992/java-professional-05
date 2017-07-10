package hw03;

import javax.swing.JOptionPane;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Go {

    private static Map<Integer, String> m = new HashMap<Integer, String>();
    private static Scanner sc;

    public void openFile(){
        try{
            sc = new Scanner(new File("yaroslav\\src\\main\\java\\hw03\\text.txt"));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
    public void readFile(){
        while(sc.hasNext()){
            int i = 0;
            m.put(++i, sc.next());
        }
    }
    public void out(){
        for (Map.Entry entry: m.entrySet()) {
            String value = (String) entry.getValue();
            System.out.println(value);
        }
    }
}
