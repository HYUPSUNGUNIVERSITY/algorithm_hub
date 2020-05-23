package _7568;

import java.io.*;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] sarr = s.split(" ");
			x[i] = Integer.parseInt(sarr[0]);
			y[i] = Integer.parseInt(sarr[1]);
		}
		
		for (int i = 0; i < x.length; i++) {
			int count = 1;
			for (int j = 0; j < x.length; j++) {
				if (x[i] < x[j] && y[i] < y[j] && i != j) {
					count++;
				}
			}
			bw.write(count+" ");
		}
		bw.write("\n");
		bw.flush();
		bw.close();
	}

}
