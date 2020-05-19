package _1002;

import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			String[] sarr = s.split(" ");
			int x1 = Integer.parseInt(sarr[0]);
			int y1 = Integer.parseInt(sarr[1]);
			int r1 = Integer.parseInt(sarr[2]);
			int x2 = Integer.parseInt(sarr[3]);
			int y2 = Integer.parseInt(sarr[4]);
			int r2 = Integer.parseInt(sarr[5]);
			if (r1 > r2) {
				int temp = r1;
				r1 = r2;
				r2 = temp;
			}
			double dtc = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
			if (r2-r1 < dtc && dtc < r1 + r2)
				bw.write("2\n");
			else if (dtc == r1+r2)
				bw.write("1\n");
			else if (dtc == r2-r1 && dtc !=0)
				bw.write("1\n");
			else if (dtc < r2  - r1 || dtc > r1+r2)
				bw.write("0\n");
			else if (dtc == 0) {
				if (r1 == r2)
					bw.write("-1\n");
				else
					bw.write("0\n");
				}
			
		}
		bw.flush();
		bw.close();
	}

}
