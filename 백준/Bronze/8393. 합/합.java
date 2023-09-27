import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int cnt,result = 0;
    cnt = scan.nextInt();
    for(int i = 1;i<=cnt;i++){
        result +=i;
    }
    System.out.println(result);
}}