import java.io.*;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int mm = n/2;
            if (mm%2 != 1) {
                bw.write("YES\n");
                int midle = n/2; // 2
                for (int j = 2; j <= midle*2; j+=2) {
                    bw.write(j+" ");
                }
                for (int j = 1; j <= midle*2; j+=2) {
                    if (j == midle*2 - 1) {
                        bw.write((j+midle)+" ");
                        break;
                    }
                    bw.write(j+" ");
                }
                bw.write("\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
