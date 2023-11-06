import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int result = 0;
        int temp = 0;
        int []nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {

                    temp = nums[i] + nums[j] + nums[k];

                    if (m == temp) {
                        result = temp;
                        break;
                    }
                    if(result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
    }
        System.out.println(result);
}}