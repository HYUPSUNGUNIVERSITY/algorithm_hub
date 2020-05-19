package _11650;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] sarr = s.split(" ");
			x.add(Integer.parseInt(sarr[0]));
			y.add(Integer.parseInt(sarr[1]));
		}
		// sort
		for (int i = 0; i < x.size() - 1; i++) {
			for (int j = i + 1; j < x.size(); j++) {
				if (x.get(i) < x.get(j)) {
					int ytemp = y.get(i);
					int xtemp = x.get(i);
					x.set(i, x.get(j));
					y.set(i, y.get(j));
					x.set(j, xtemp);
					y.set(j, ytemp);					
				}
			}
		}
		
		for (int i = 0; i < x.size() - 1; i++) {
			for (int j = i + 1; j < x.size(); j++) {
				if (x.get(i) == x.get(j) && y.get(i) < y.get(j)) {
					int ytemp = y.get(i);
					int xtemp = x.get(i);
					//x.set(i, x.get(j));
					y.set(i, y.get(j));
					//x.set(j, xtemp);
					y.set(j, ytemp);					
				}
			}
		}
		
		for (int i = x.size()-1; i >= 0; i--) {
			bw.write(x.get(i) + " " + y.get(i) +"\n");
		}
		
		bw.flush();
		bw.close();
	}
	

}
