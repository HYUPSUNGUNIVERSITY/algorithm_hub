package _2798;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s1 = br.readLine();
		String[] sarr1 = s1.split(" ");
		String s2 = br.readLine();
		String[] sarr2 = s2.split(" ");
		int max = 0;
		int n = Integer.parseInt(sarr1[0]);
		int m = Integer.parseInt(sarr1[1]);
		int[] iarr = new int[n];
		for (int i = 0; i < n; i++) {
			iarr[i] = Integer.parseInt(sarr2[i]);
		}
		
		aa: for (int i = 0; i < iarr.length-2; i++) {
			for (int j = i+1; j < iarr.length - 1; j++) {
				for (int k = j+1; k < iarr.length; k++) {
					int sum = iarr[i] + iarr[j] + iarr[k];
					if (sum <= m)
						max = Math.max(sum, max);
					if (max == m)
						break aa;
				}
			}
		}
		bw.write(max+"\n");
		bw.flush();
		bw.close();
	}

}
