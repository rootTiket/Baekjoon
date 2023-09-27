import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int cnt;
    cnt = scan.nextInt();
    int []nums = new int[cnt*2];
    for(int i = 0 ;i<nums.length;i++){
        nums[i] = scan.nextInt();
    }
    for(int i=0;i<(nums.length-1);i=i+2){
        System.out.println(nums[i]+nums[i+1]);
    }
}}