

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream s = System.out;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();
        
        
        
        ByteArrayOutputStream oS = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(oS);
        System.setOut(ps);
        
        testString.printSomething();
        
        System.setOut(s);
        String st = oS.toString();
        
        FileOutputStream outStr = new FileOutputStream(a);
        outStr.write(oS.toByteArray());
        outStr.close();
        System.out.println(st);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

