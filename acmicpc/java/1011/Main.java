package _1011;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cases = Integer.parseInt(br.readLine());
       
        for(int i = 0; i< cases; ++i) {
        	String s = br.readLine();
			String[] sarr = s.split(" ");
			int start = Integer.parseInt(sarr[0]);
			int end = Integer.parseInt(sarr[1]);
			    
			bw.write(cal(end - start)+"\n");
			
                        
        }
        bw.flush();
        bw.close();
    }

    static int cal(int dist){
        if(dist==1)
            return 1;
        if(dist==2)
            return 2;
        if(dist==3)
            return 3;
        if(dist==0)
            return 0;

        int n = (int)Math.sqrt(dist);
        int remain = dist-(int)Math.pow(n,2);

        if((remain % n) != 0)
            return (2*n-1)+(remain/n)+1;
        else
            return (2*n-1)+(remain/n);
    }
}