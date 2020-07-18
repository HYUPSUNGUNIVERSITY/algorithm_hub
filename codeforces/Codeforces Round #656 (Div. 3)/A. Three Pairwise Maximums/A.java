package _CfR656D3;

import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] strings = s.split(" ");
            int[] ints = new int[3];
            for (int j = 0; j < 3; j++) {
                ints[j] = Integer.parseInt(strings[j]);
            }
            if (ints[0] == ints[1] && ints[0] == ints[2]) {
                bw.write("YES\n");
                bw.write(ints[0]+" "+ints[0]+" "+ints[0]+"\n");
            } else if (ints[0] == ints[1] && ints[0] > ints[2]) {
                bw.write("YES\n");
                bw.write(ints[2]+" "+(ints[2])+" "+ints[0]+"\n");
            } else if (ints[1] == ints[2] && ints[1] > ints[0]) {
                bw.write("YES\n");
                bw.write(ints[0]+" "+(ints[0])+" "+ints[1]+"\n");
            } else if (ints[0] == ints[2] && ints[0] > ints[1]) {
                bw.write("YES\n");
                bw.write(ints[1]+" "+(ints[1])+" "+ints[0]+"\n");
            } else {
                bw.write("NO\n");
            }


        }

        bw.flush();
        bw.close();
    }
}
