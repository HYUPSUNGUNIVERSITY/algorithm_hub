package _10872;

import java.io.*;

public class Main {

	public static int re(int n) {
		if (n==0) {
			return 1;}
		if (n == 1)
			return 1;
		
		return n*re(n-1);
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int h = re(n);
		bw.write(h+"\n");
		bw.flush();
		bw.close();
	}

}
