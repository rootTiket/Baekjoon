
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][]numarr = new int[9][9];
        for(int i =0;i<9;i++){
            for(int j = 0; j<9 ; j++){
                numarr[i][j] = in.nextInt();
            }
        }
        int max = -1;
        int maxi = 0;
        int maxj = 0;
        for(int i =0;i<9;i++){
            for(int j = 0; j<9 ; j++){
                if(numarr[i][j] > max){
                    max = numarr[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }
        System.out.printf("%d\n%d %d",max,maxi+1,maxj+1);
    }
}