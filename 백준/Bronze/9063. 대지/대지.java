import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n!=1) {
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }
            Arrays.sort(x);
            Arrays.sort(y);
            System.out.println((x[n - 1] - x[0]) * (y[n - 1] - y[0]));
        }
        else{
            System.out.println(0);
        }
    }

}