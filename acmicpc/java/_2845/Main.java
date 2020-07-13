package _2845;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String[] strings1 = s1.split(" ");
        int l = Integer.parseInt(strings1[0]);
        int p = Integer.parseInt(strings1[1]);
        int sol = l*p;
        String s2 = br.readLine();
        String[] strings2 = s2.split(" ");
        int size = 5;
        int[] target = new int[5];
        for (int i = 0; i < size; i++) {
            target[i] = Integer.parseInt(strings2[i]);
            int gap = 0;
            gap = target[i] - sol;
            bw.write(gap+" ");
        }
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}
