import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int total,amt;
    int result = 0;
    total = scan.nextInt();
    amt = scan.nextInt();
    int []prices = new int[amt*2];
    for(int i = 0; i<prices.length;i++){
        prices[i] = scan.nextInt();
    }
    for(int i = 0; i<(prices.length-1);i=i+2){
        result += prices[i] * prices[i+1];
        }
    if(result == total){
    System.out.println("Yes");}
    else{
        System.out.println("No");}
    }
}