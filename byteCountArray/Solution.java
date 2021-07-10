package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String fN = br.readLine();

        int [] byteCountArray = new int[128];
        try(FileInputStream fis = new FileInputStream(fN)){
            while (fis.available()>0){
                byteCountArray[fis.read()] +=1;
            }
        }
        int max = 0;
        for (int byteCount : byteCountArray){
            if (byteCount>max)
                max = byteCount;
        }
        ArrayList<Integer> resultMax = new ArrayList<>();
        for (int i =0; i<byteCountArray.length; i++){
            if(byteCountArray[i] == max)resultMax.add(i);
        }
        for (Integer resultByteMax : resultMax)
            System.out.print(resultByteMax + " ");
            //fis.close();


    }
}
