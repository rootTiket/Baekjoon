import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, M,i,j;
        N = scan.nextInt();
        M = scan.nextInt();
        int [] nums= new int[N];
        for(int x =0;x<N;x++){
            nums[x] = x+1;
        }
        for(int x =0;x<M;x++){
            i = scan.nextInt();
            j = scan.nextInt();
            while(j-i >=0){
                int emt = 0;
                emt = nums[i-1];
                nums[i-1] = nums[j-1];
                nums[j-1] = emt;
                i +=1;
                j -=1;
            }

        }
        for(int x = 0;x<nums.length;x++){
            System.out.printf("%d ",nums[x]);
        }
}}