package _2231;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean check = false;
		int n = Integer.parseInt(br.readLine());
		int i1 = 0,i10 = 0, i100 = 0, i1000 = 0,
			i10000 = 0, i100000 = 0, i1000000 = 0;
		
		for (int i = 2; i < n; i++) {
			int sum = i;
			int temp = i;
			if (temp >= 1000000) {
				i1000000 = temp/1000000;
				temp -= i1000000 * 1000000;
			}
			if (temp >= 100000) {
				i100000 = temp/ 100000;
				temp -= i100000 * 100000;
			}
			if (temp >= 10000) {
				i10000 = temp/10000;
				temp -= i10000 * 10000;
			}
			if (temp >= 1000) {
				i1000 = temp/1000;
				temp -= i1000 * 1000;
			}
			if (temp >= 100) {
				i100 = temp/100;
				temp -= i100 * 100;
			}
			if (temp >= 10) {
				i10 = temp / 10;
				temp -= i10 * 10;
			}
			if (temp < 10) {
				i1 = temp;
			}
			sum += i1+i10+i100+i1000+i10000+i100000+i1000000;
			if (sum == n) {
				bw.write(i+"\n");
				check = true;
				break;
			}
		}
		if (!check)
			bw.write("0\n");
		bw.flush();
		bw.close();
	}
	

}
