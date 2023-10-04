import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        String s ;
        s = scan.nextLine();
        N = scan.nextInt();

        System.out.println(s.charAt(N-1));
}}