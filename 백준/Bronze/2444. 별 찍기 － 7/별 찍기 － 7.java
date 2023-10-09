
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0; i<num; i++)
        {
            for(int k=i; k<(num-1); k++)
            {
                System.out.printf(" ");
            }
            for(int k=0; k<=(i*2); k++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");

        }

        for(int i=(num-2); i>=0; i--)
        {
            for(int k=i; k<(num-1); k++)
            {
                System.out.printf(" ");
            }
            for(int k=0; k<=(i*2); k++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }}