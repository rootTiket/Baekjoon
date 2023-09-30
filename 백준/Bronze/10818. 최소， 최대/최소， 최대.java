import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scan.nextInt();
        }
        int min = nums[0];
        for (int i=1;i<n;i++){
            if(nums[i] <min){
                min = nums[i];
            }
        }
        int max = nums[0];
        for (int i=1;i<n;i++){
            if(nums[i] >max){
                max = nums[i];
            }
        }
        System.out.printf("%d %d",min,max);
}}