

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> dd = new HashSet<>();
        List<String> checkList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dd.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            String check = br.readLine();
            if (dd.contains(check)) {
                checkList.add(check);
            }
        }
        Collections.sort(checkList);
        StringBuilder sb = new StringBuilder();
        sb.append(checkList.size()+"\n");
        for (String r : checkList) {
            sb.append(r+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
