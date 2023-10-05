import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int []num = new int[26];
        Arrays.fill(num,-1);
        int []check = new int[s.length()];
        for(int i = 0 ;i<s.length();i++){
            for(int j = 0 ;j<26;j++) {
                if (((int) s.charAt(i) - 97) == j && num[j] == -1)
                {
                    num[j] = i;
                }
            }
        }
        for(int i = 0; i<26;i++){
            System.out.printf("%d ",num[i]);
        }
    }
}