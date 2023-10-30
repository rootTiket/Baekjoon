import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x1= in.nextInt();
        int y1= in.nextInt();

        int x2= in.nextInt();
        int y2= in.nextInt();

        int x3= in.nextInt();
        int y3= in.nextInt();

        int x = x1;
        int y = y1;

        if(x1==x2) {
            x=x3;
        }
        if(x1==x3) {
            x=x2;
        }

        if(y1==y2) {
            y=y3;
        }
        if(y1==y3) {
            y=y2;
        }
        System.out.printf("%d %d",x,y);
    }

}