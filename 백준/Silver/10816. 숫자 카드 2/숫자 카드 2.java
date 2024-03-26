

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> cards = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (cards.containsKey(k)) {
                cards.put(k,cards.get(k)+1);
            } else {
                cards.put(k,1);
            }
        }
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (cards.containsKey(k)) {
                result.add(cards.get(k));
            } else {
                result.add(0);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer item : result) {
            sb.append(item);
            sb.append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
}
}

