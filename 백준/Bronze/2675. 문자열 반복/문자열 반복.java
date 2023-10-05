import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []times = new int[n];
        String []alpha = new String[n];
        for(int i =0 ;i<n;i++){
            times[i] = scan.nextInt();
            alpha[i] = scan.next();
        }
        for(int i =0 ;i<n;i++){
            for(char c:alpha[i].toCharArray()){
                for(int j=0;j<times[i];j++){
                    System.out.printf("%c",c);
                }
            }
            System.out.println();
        }
}
}