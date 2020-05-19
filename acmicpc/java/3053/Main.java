package _3053;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int r = Integer.parseInt(br.readLine());
		
		bw.write(Math.PI*Math.pow(r, 2)+"\n");
		bw.write(Math.pow(r, 2)*2+"\n");
		
		bw.flush();
		bw.close();
	}

}
