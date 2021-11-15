package min_byte;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(is.readLine());
        int min = 300;

        while(inputStream.available()>0) {
            int data = inputStream.read();
            if (data < min) {
                min = data;
            }
        }
            inputStream.close();
            System.out.println(min);
    }
}
