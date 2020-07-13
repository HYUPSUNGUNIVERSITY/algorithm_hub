package _2914;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] strings = s.split(" ");
        int a = Integer.parseInt(strings[0]);
        int l = Integer.parseInt(strings[1]);
        int sol = a*(l-1) +1;
        bw.write(sol+"\n");

        bw.flush();
        bw.close();
    }
}
