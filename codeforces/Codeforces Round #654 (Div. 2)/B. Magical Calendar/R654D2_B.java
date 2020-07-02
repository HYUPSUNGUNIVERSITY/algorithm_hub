import java.io.*;

public class R654D2_B {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] srr = s.split(" ");
            long n = Long.parseLong(srr[0]);
            long r = Long.parseLong(srr[1]);

            if (r<n) {
                bw.write(r*(r+1)/2+"\n");
            } else {
                bw.write(n*(n-1)/2+1+"\n");
            }

        }



        bw.flush();
        bw.close();
    }
}
