import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []check = new int[42];
        Arrays.fill(check,-1);
        int cnt = 0;
        for (int i=0;i<10;i++){
            int a = scan.nextInt();
            check[(a % 42)] = a % 42;
            
        }
        for (int i=0;i<check.length;i++){
            if(check[i] >=0){
                cnt +=1;
            }
        }
        System.out.println(cnt);
}}