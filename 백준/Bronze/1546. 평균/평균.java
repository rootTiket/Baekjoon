import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, i;
        N = scan.nextInt();
        float [] nums= new float[N];
        float result = 0;
        for(i =0;i<N;i++){
            nums[i] = scan.nextInt();
        }
        float max = nums[0];
        int flag = 0;
        for(i =1;i<N;i++){
            if(nums[i]>max){
                max = nums[i];
                flag = i;
            }
        }
        for(i=0;i<N;i++){
                nums[i] = (nums[i] / max) * 100;
            result = result + nums[i];
        }
        System.out.println(result/N);
}}