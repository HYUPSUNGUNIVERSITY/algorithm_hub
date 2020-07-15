package _2609;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] strings = s.split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int gcf = gcf(Math.max(a, b), Math.min(a, b));
        int lcm = lcm(a, b, gcf);

        bw.write(gcf+"\n");
        bw.write(lcm+"\n");
        bw.flush();
        bw.close();
    }

    private static int lcm(int a, int b, int gcf) {
        return (a*b)/gcf;
    }

    private static int gcf(int a, int b) {
        while (b > 0) {
            int temp = a;
            a=b;
            b=temp%b;
        }
        return a;
    }
}
