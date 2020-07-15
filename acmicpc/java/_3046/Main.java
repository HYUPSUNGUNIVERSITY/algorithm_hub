package _3046;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] strings = s.split(" ");

        int[] ints = new int[2];
        ints[0] = Integer.parseInt(strings[0]);
        ints[1] = Integer.parseInt(strings[1]);

        int sol = ints[1]*2-ints[0];
        bw.write(sol+"\n");

        bw.flush();
        bw.close();
    }
}
