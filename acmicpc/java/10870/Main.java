package _10870;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Long> kk = new ArrayList<Long>();
		kk.add((long) 0);
		kk.add((long) 1);
		long n = Integer.parseInt(br.readLine());
		for (int i = 1; i < n; i++) {
			kk.add(kk.get(i-1)+kk.get(i));
		}
		bw.write(kk.get(kk.size()-1)+"\n");
		bw.flush();
		bw.close();
	}

}
