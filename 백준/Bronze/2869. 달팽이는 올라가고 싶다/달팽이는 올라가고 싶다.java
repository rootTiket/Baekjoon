import java.io.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String []s = br.readLine().split(" ");
        int a, b ,v,d;
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
        v = Integer.parseInt(s[2]);
        d = (v-b) /(a-b);
        if ((v-b) %(a-b) != 0) {
            d++;
        }
        System.out.println(d);
    }
}