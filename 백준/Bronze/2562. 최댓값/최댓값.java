import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []nums = new int[9];
        for (int i=0;i<9;i++){
            nums[i] = scan.nextInt();
        }
        int cnt = 1;
        int max = nums[0];
        for (int i=1;i<9;i++){
            if(nums[i] >max){
                max = nums[i];
                cnt = i+1;
            }
        }
        System.out.printf("%d\n%d",max,cnt);
}}