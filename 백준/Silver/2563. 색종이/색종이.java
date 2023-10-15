import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][]square = new int[100][100];
        int total = 0;
        for(int i=0;i<n;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            for(int j = x; j<x+10;j++){
                for(int k =y;k<y+10;k++){
                    square[j][k] = 1;
                }
            }
        }
        for(int i = 0; i< 100; i++){
            for(int j =0;j<100;j++){
                if(square[i][j] == 1){
                    total += 1;
                }
            }
        }
        System.out.println(total);
    }
}