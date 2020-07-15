package _5338;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw.write("       _.-;;-._\n" +
                "'-..-'|   ||   |\n" +
                "'-..-'|_.-;;-._|\n" +
                "'-..-'|   ||   |\n" +
                "'-..-'|_.-''-._|\n");
        bw.flush();
        bw.close();
    }
}
