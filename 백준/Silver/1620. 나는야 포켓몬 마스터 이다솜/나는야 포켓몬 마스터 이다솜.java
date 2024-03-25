import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer, String> numToName = new HashMap<>();
        Map<String, Integer> nameToNum = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            numToName.put(i,s);
            nameToNum.put(s,i);
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if ((Character.isDigit(s.charAt(0)))) {
                System.out.println(numToName.get(Integer.parseInt(s)));
            } else {
                System.out.println(nameToNum.get(s));
            }
        }
}
}