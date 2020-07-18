package _12605;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            String s = br.readLine();
            String[] strings = s.split(" ");
            int size = strings.length;
            Stack<String> stringStack = new Stack<String>();
            for (int j = 0; j < size; j++) {
                stringStack.push(strings[j]);
            }
            bw.write("Case #"+(i+1)+": ");
            for (int j = 0; j < size; j++) {
                bw.write(stringStack.pop()+" ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
