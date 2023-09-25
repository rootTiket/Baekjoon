import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A,B,C;
        A= scan.nextInt();
        B= scan.nextInt();
        C = B%10;
        System.out.println( (A * C));
        C = B%100 - C;
        System.out.println((A * C)/10);
        C = B%1000 - B%100;
        System.out.println((A * C)/100);
        System.out.println(A*B);
    }
}