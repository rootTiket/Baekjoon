import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] ss = s.split(" ");
            if (map.containsKey(ss[0])) {
                map.remove(ss[0]);
            } else {
                map.put(ss[0],ss[1]);
            }
        }
        List<String> result = new ArrayList<>(map.keySet());
        Collections.sort(result,Collections.reverseOrder());
        for (String s : result) {
            System.out.println(s);
        }
}

}