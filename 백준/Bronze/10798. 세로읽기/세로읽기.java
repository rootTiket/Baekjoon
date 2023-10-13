import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [][] c = new char[5][15];
        String s;
        int max = 0;
        for(int i =0;i<5;i++){
            s = in.next();
            for(int j=0; j<s.length(); j++) {
                c[i][j] = s.charAt(j);
            }
            max = Math.max(max, s.length());
        }
        for(int i = 0 ; i<max;i++){
            for(int j =0;j<5;j++){
                if(c[j][i]=='\0') continue;
                System.out.print(c[j][i]);
            }
        }
    }
}