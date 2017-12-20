package ooplab6;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class myStringToken {
    public static void main(String[] args) {
        String s = "Welcome to RMUTV";
        StringTokenizer tokenizer = new StringTokenizer(s);
        //count word in String
        System.out.println(tokenizer.countTokens());
        //cut word in String
        while (tokenizer.hasMoreTokens()){
            StringBuffer buffer = new StringBuffer(tokenizer.nextToken());
            System.out.println(buffer.reverse());
        }

    }
}
