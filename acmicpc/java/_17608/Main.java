package _17608;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            array[i] = k;
        }
        int count = 1;
        int max = array[n-1];
        for (int i = n-2; i >= 0; i--) {
            if (array[i] > max) {
                count++;
                max = array[i];
            }
        }
        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }
}
