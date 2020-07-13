package _2475;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] strings = s.split(" ");
        int size = 5;
        int sol = 0;

        for (int i = 0; i < 5; i++) {
            sol += Math.pow(Integer.parseInt(strings[i]), 2);
        }
        bw.write(sol%10+"\n");


        bw.flush();
        bw.close();
    }
}
