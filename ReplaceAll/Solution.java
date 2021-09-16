package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream ps = System.out;
        
        ByteArrayOutputStream oS = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(oS);
        System.setOut(stream);
        
        testString.printSomething();
        
        System.setOut(ps);
        
        String s = oS.toString();
        System.out.println(s.replaceAll("[^0-9]",""));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
