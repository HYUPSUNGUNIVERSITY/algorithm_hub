import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class CC {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            //for (int j = 0; j < n; j++) {
                String s = br.readLine();
                String[] strings = s.split(" ");
                Stack<Integer> sol = new Stack<Integer>();
                int[] ints = new int[n];
                for (int k = 0; k < n; k++) {
                    ints[k] = Integer.parseInt(strings[k]);
                }

                for (int k = 0; k < n; k++) {
                    if (sol.isEmpty()) {
                        sol.push(ints[k]);
                    } else {
                        int temp = sol.pop();
                        if (temp > 0 && ints[k] > 0) {
                                if (ints[k] > temp)
                                    sol.push(ints[k]);
                                else
                                    sol.push(temp);
                        } else if (temp < 0 && ints[k] < 0) {
                            if (ints[k] > temp)
                                sol.push(ints[k]);
                            else
                                sol.push(temp);
                        } else {
                            sol.push(temp);
                            sol.push(ints[k]);
                        }
                    }
                }
                long sum = 0;
                int size = sol.size();
                for (int j = 0; j < size; j++) {
                    sum += sol.pop();
                }
                bw.write(sum+"\n");
            }

       // }

        bw.flush();
        bw.close();
    }
}
