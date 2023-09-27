import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h,m,t;
    h = scan.nextInt();
    m = scan.nextInt();
    t = scan.nextInt();
    m = t+ m;
    if(m>=60){
        h = h + (m/60);
        m = m%60;
        if(h>=24){
            h = h-24;
        }
    }
    System.out.printf("%d %d",h,m);
}}
