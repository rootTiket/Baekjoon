import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    String[] str = new String[(input/4) + 1];
    for(int i = 0 ;i< (str.length-1);i++){
        str[i] = "long ";
    }
    str[(input/4)] = "int";
    for(int i = 0 ;i< (str.length);i++){
            System.out.printf(str[i]);
    }
}
}