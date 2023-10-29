import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int cnt = 1;
        int rng = 2;
        if ( n == 1){
            System.out.println(1);
        }
        else {
            while(true){
                if(rng>n){
                    break;
                }
                rng = rng + (cnt*6);
                cnt ++;
            }
            System.out.println(cnt);
        }

    }

}