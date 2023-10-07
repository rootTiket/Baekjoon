import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []num = new int[6];
        int []check = {1,1,2,2,2,8};
        for(int i =0;i<6;i++){
            num[i] = scan.nextInt();
            check[i] = check[i] - num[i];
        }
        for(int i =0;i<6;i++){
            System.out.printf("%d ",check[i]);
        }
    }}