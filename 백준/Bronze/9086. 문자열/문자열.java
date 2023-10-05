import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String []s = new String[n];
        for (int i = 0; i<s.length;i++){
            s[i] = scan.next();
        }
        for (int i = 0; i<s.length;i++){
            System.out.printf("%c%c\n",s[i].charAt(0),s[i].charAt(s[i].length()-1));
        }
    }
}