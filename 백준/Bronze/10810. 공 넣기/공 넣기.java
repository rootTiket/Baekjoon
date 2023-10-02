import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int []nums = new int[N];
        for (int x=0;x<N;x++){
            nums[x] = 0;
        }
        for (int x=0;x<M;x++){
            int i,j,k;
            i = scan.nextInt();
            j = scan.nextInt();
            k = scan.nextInt();
            for(int y = i-1;y<=j-1;y++){
              nums[y] = k;
            }
        }
        for (int x=0;x<N;x++){
            System.out.printf("%d ",nums[x]);
        }
}}