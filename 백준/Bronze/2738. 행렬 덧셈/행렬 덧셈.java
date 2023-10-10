import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int [][]arr1 = new int[N][M];
        int [][]arr2 = new int[N][M];
        int [][]result = new int[N][M];

        for(int i = 0;i<N;i++){
            for(int j =0;j<M;j++) {
                arr1[i][j] = scan.nextInt();
            }}
        for(int i = 0;i<N;i++){
            for(int j =0;j<M;j++) {
                arr2[i][j] = scan.nextInt();
            }}
        for(int i = 0;i<N;i++){
            for(int j =0;j<M;j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }}
        for(int i = 0;i<N;i++){
            for(int j =0;j<M;j++) {
                System.out.printf("%d ",result[i][j]);
            }
            System.out.printf("\n");
        }

}}