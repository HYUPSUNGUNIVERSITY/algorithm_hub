import java.io.*;
import java.util.Scanner;

public class _1550 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        bw.write(Integer.parseInt(num, 16)+"\n");

        bw.flush();
        bw.close();
    }
}
