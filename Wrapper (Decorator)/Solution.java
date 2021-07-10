package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] byteArray = new int[128];
        try (FileInputStream fis = new FileInputStream(s)) {
            while (fis.available() > 0) {
                byteArray[fis.read()] += 1;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int count : byteArray) {
            if (count > 0 && count < min)
                min = count;
        }
        ArrayList<Integer> aL = new ArrayList<>();
        int i;
        for (i = 0; i < byteArray.length;i++){
            if (byteArray[i] == min)
                aL.add(i);
        }
        for( int resulti : aL){
            System.out.print(resulti + " ");
        }


    }
}
