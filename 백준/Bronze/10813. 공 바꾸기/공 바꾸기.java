import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int []nums = new int[N];
        for (int x=0;x<N;x++){
            nums[x] = x+1;
        }
        for (int x=0;x<M;x++){
            int i,j;
            int emp = 0;
            i = scan.nextInt();
            j = scan.nextInt();
            emp = nums[i-1];
            nums[i-1] = nums[j-1];
            nums[j-1] = emp;
        }
        for (int x=0;x<N;x++){
            System.out.printf("%d ",nums[x]);
        }
}}