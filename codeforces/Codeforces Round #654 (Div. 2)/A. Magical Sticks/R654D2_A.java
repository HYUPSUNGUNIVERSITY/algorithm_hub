import java.io.*;

public class R654D2_A {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < t; i++) {
            if (arr[i]%2==0)
                bw.write(arr[i]/2+"\n");
            else
                bw.write(arr[i]/2+1+"\n");
        }

        bw.flush();
        bw.close();
    }
}
