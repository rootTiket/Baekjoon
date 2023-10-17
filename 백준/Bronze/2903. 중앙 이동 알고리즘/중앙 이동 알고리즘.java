
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double dot = 1;
        dot = dot + Math.pow(2,n);
        System.out.println((int)Math.pow(dot,2));


    }
}