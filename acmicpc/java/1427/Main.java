package _1427;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		Integer[]  larr = new Integer[s.length()];
		for (int i = 0; i < s.length(); i++) {
			String temp = Character.toString(s.charAt(i));
			larr[i] = Integer.parseInt(temp);
		}
		Arrays.sort(larr, Collections.reverseOrder());
		for (int i = 0; i < larr.length; i++) {
			System.out.print(larr[i]);
		}
		
		bw.flush();
		bw.close();
	}

}
