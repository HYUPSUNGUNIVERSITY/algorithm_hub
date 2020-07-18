package _CfR656D3;

import java.io.*;
import java.util.ArrayList;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String[] strings = s.split(" ");
            int[] p = new int[2*n];

            ArrayList<Integer> rp = new ArrayList<Integer>();
            for (int j = 0; j < 2*n; j++) {
                p[j] = Integer.parseInt(strings[j]);
            }
            for (int j = 0; j < p.length; j++) {
                if (!rp.contains(p[j])) {
                    rp.add(p[j]);
                }
            }
            for (int j = 0; j < rp.size(); j++) {
                bw.write(rp.get(j)+" ");
            }
            bw.write("\n");

        }

        bw.flush();
        bw.close();
    }
}
