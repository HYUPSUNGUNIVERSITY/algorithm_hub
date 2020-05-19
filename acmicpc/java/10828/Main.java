package _10828;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> s = new ArrayList<Integer>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String ss = br.readLine();
			String[] sarr = ss.split(" ");
			switch(sarr[0]) {
				case "push":
					s.add(Integer.parseInt(sarr[1]));
					break;
				case "pop":
					if (s.isEmpty()) {
						bw.write("-1\n");}
					else {
					bw.write(s.get(s.size()-1)+"\n");
					s.remove(s.remove(s.size()-1));
					}
					break;
				case "size":
					bw.write(s.size()+"\n");
					break;
				case "empty":
					if (s.isEmpty()) {
						bw.write("1\n");}
					else {
						bw.write("0\n");}
					break;
				case "top":
					if (s.isEmpty()) {
						bw.write("-1\n");}
					else {
						bw.write(s.get(s.size()-1)+"\n");}
					break;
				default:
					break;
			}
		
		}
		bw.flush();
		bw.close();
	}

}
