import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1;
        String file2;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = br.readLine();
            file2 = br.readLine();
        }
        ArrayList<Integer> list = new ArrayList<>();
        try(FileReader fr1 = new FileReader(file1)) {
            while (fr1.ready()){
           list.add(fr1.read());
            }
        }

        try(FileWriter writer = new FileWriter(file2)) {
            for (int i = 1; i < list.size(); i = i + 2) {
                writer.write((byte) (int) list.get(i));
            }
        }
    }

