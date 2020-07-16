import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 2;
            for (int j = 3; j < 999999999; j+= Math.pow(2, count++)) {
                if (n % j == 0) {
                    bw.write(n/j+"\n");
                    break;
                }
            }

        }


        bw.flush();
        bw.close();
    }
}
