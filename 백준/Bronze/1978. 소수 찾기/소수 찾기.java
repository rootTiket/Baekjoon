

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int cnt = 0;
        int a;
        for( int i =0;i<n;i++){
            a = in.nextInt();
            for(int j = 2 ; j<=a;j++){
                if (j == a){
                    cnt ++;
                }
                else if(a%j == 0){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}