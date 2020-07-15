package _14592;

import java.io.*;

class person {
    private int s, c, l;
    person(int s, int c, int l) {
        this.s = s;
        this.c = c;
        this.l = l;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
}

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        person[] a = new person[n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] strings = s.split(" ");
            int score = Integer.parseInt(strings[0]);
            int commit = Integer.parseInt(strings[1]);
            int limit = Integer.parseInt(strings[2]);
            a[i] = new person(score, commit, limit);
        }
        sortingp(a);
        bw.flush();
        bw.close();
    }

    private static void sortingp(person[] a) {
        int size = a.length;
        int sol = 0;
        int max = 0;

        for (int i = 0; i < size; i++) {
            if (a[i].getS() > max) {
                max = a[i].getS();
                sol = i;
            } else if (a[i].getS() == max) {
                if (a[sol].getC() > a[i].getC()) {
                    sol = i;
                } else if (a[i].getC() == a[sol].getC()) {
                    if (a[sol].getL() > a[i].getL()) {
                        sol = i;
                    }
                }
            }
        }
        System.out.println(sol+1);
    }
}
