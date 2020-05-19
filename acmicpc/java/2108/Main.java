package _2108;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		ArrayList<Integer> n = new ArrayList<Integer>();
		while ((s = br.readLine()) != null && !s.isEmpty()) {
			n.add(Integer.parseInt(s));
		}
		
		//arithmetic mean
		Iterator<Integer> in = n.iterator();
		int amean = 0;
		while (in.hasNext()) {
			amean += in.next();
		}
		bw.write(Math.round(amean/n.size())+"\n");
		//median
		int m = n.size()/2;
		bw.write(n.get(m)+"\n");
		
		//mode
		
		Iterator<Integer> in2 = n.iterator();
		int[] iarr = new int[8001];
		while (in2.hasNext()) {
			int temp = in2.next();
			if (temp > 0)
				iarr[temp]++;
			else
				iarr[Math.abs(temp)+4000]++;
		}
		Arrays.sort(iarr);
		int max = Integer.MIN_VALUE;
		int idx =0;
		for(int i=0;i<iarr.length;i++) {
			if(iarr[i]!=0 && iarr[i]>max) {		
				max = iarr[i];
				idx = i;				
			}
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0;i<iarr.length;i++) {
			int x=i;
			if(iarr[i]==max) { 
				if(i>4000) { 
					x-=4000;
					x*=-1;
					arrayList.add(x); 
				}else
					arrayList.add(i); 
			}
		}
		Collections.sort(arrayList); 
		
		if(arrayList.size()>1) bw.write(arrayList.get(1)+"\n"); 
		else bw.write(arrayList.get(0)+"\n"); 	
	
		//range
		;
		bw.write(iarr[iarr.length-1]-iarr[0]+"\n");
		
		
		bw.flush();
		bw.close();
	}

}
