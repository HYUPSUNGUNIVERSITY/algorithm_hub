package _7523;

import java.io.*;

public class Main {

	static long gaus(long n, long m) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long re = 0;
		if (n > 0) {
			long k = m - n + 1;
			if ( k%2 == 0) {
				re = (m+n)*(k/2);
			}
			else {
				re = (m+n)*(k/2)+(m+n)/2;
			}
		}
		else {
			long k = m - n + 1;
			if ( k%2 == 0) {
				re = (m+n)*(k/2);
			}
			else {
				re = (m+n)*(k/2)+(m+n)/2;
			}
		}
		return re;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i ++) {
			String s = br.readLine();
			String[] sarr = s.split(" ");
			long n = Integer.parseInt(sarr[0]);
			long m = Integer.parseInt(sarr[1]);
			long re = gaus(n, m);
			bw.write("Scenario #"+i+":"+"\n");
			bw.write(re+"\n");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
	}

}
