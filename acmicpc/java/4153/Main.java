package _4153;

import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			String s = br.readLine();
			String[] sarr = s.split(" ");
			int a = Integer.parseInt(sarr[0]);
			int b = Integer.parseInt(sarr[1]);
			int c = Integer.parseInt(sarr[2]);
			if (a == 0 && b == 0 && c == 0)
				break;
			if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)
			|| Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)
			|| Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))
				bw.write("right\n");
			else
				bw.write("wrong\n");
		}
		
		bw.flush();
		bw.close();
	}

}
