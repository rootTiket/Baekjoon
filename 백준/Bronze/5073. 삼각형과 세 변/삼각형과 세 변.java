import java.io.*;
import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int[] nums = {a,b,c};
            Arrays.sort(nums);
            if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
                break;
            }
            if (nums[2] < nums[1] + nums[0]) {
                if (nums[0] == nums[1] && nums[1] == nums[2]) {
                    System.out.println("Equilateral");
                } else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
            else System.out.println("Invalid");
        }
    }
}