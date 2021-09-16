package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream ps = System.out;
        
        ByteArrayOutputStream outputS = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputS);
        System.setOut(stream);
        
        testString.printSomething();
        
        
        
        System.setOut(ps);
        
        
        String result = outputS.toString().toUpperCase();
        
        
        System.out.println(result);
        

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
