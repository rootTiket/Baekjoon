import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []nums = new int[30];
        for (int i=0;i<28;i++){
            int a = scan.nextInt();
            nums[a-1] = a;
        }
        for (int x=0;x<nums.length;x++){
            if(nums[x]==0) {
                System.out.println(x+1);
            }
        }
}}