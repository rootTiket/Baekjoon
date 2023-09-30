import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scan.nextInt();
        }
        int search = scan.nextInt();
        int cnt=0;
        for (int i=0;i<n;i++){
            if(nums[i] == search){
                cnt += 1;
            }
        }
        System.out.println(cnt);
}}