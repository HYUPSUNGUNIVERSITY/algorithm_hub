package _1259;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) return;

            if (pali(n)) {
                bw.write("yes\n");
                bw.flush();
            } else {
                bw.write("no\n");
                bw.flush();
            }
        }


    }

    private static boolean pali(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int front = 0, rear = chars.length - 1;

        while (front < rear) {
            if (chars[front] != chars[rear])
                return false;
            front++;
            rear--;
        }

        return true;
    }
}
