

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s1c = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        HashSet<Integer> s2c = new HashSet<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            s1.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            s2.add(Integer.parseInt(st.nextToken()));
        }
        for (int j : s1) {
            if (!s2.contains(j)) {
                s1c.add(j);
            }
        }
        for (int j : s2) {
            if (!s1.contains(j)) {
                s2c.add(j);
            }
        }
        System.out.println(s1c.size()+s2c.size());
    }
}