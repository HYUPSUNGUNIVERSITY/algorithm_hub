package _10039;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> num = new ArrayList<Integer>();
        int result = 0;
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }

        Iterator<Integer> key = num.iterator();

        while (key.hasNext()) {
            temp = key.next();
            if (temp > 40)
                result += temp;
            else
                result += 40;
        }
        bw.write(result/5+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
