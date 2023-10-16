
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []money = new int[n];
        int qua,dime,nick;
        for(int i =0; i< n;i++){
            money[i] = in.nextInt();
        }
        for(int i = 0 ; i< n;i++) {
            qua = money[i] / 25;
            money[i] = money[i] % 25;
            dime = money[i] / 10;
            money[i] = money[i] % 10;
            nick = money[i] / 5;
            money[i] = money[i] % 5;
            System.out.printf("%d %d %d %d\n",qua,dime,nick,money[i]);
        }

    }
}