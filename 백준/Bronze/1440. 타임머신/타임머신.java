import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] N;
        int[] time = new int[3];
        N = scan.next().split(":");
        int cnt = 0;

        for (int i = 0; i < 3; i++)
        {
            time[i] = Integer.parseInt(N[i]);
            if (time[i]>0 && time[i]<=12) {
                cnt += 1;
            } else if (time[i] > 59) {
                System.out.println(0);
                System.exit(0);
            }
        }
        System.out.println(cnt*2);

    }
}