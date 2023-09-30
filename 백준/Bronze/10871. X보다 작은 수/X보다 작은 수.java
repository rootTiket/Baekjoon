import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int flag = scan.nextInt();
        int []nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scan.nextInt();
        }

        for (int i=0;i<n;i++){
            if(nums[i] <flag){
                System.out.printf("%d ",nums[i]);
            }
        }
}}