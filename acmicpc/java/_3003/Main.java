package _3003;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] strings = s.split(" ");
        int size = 6;
        int[] ints = {1, 1, 2, 2, 2, 8};
        int[] target = new int[size];
        for (int i = 0; i < size; i++) {
            target[i] = Integer.parseInt(strings[i]);
            bw.write(ints[i] - target[i]+" ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
