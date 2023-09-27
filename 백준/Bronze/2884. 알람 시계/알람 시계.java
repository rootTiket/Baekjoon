import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h,m;
    h = scan.nextInt();
    m = scan.nextInt();
    if(m<45){
        m = 60+m-45;
        if(h==0){
            h = 23;
        }
        else{
        h -= 1;
        }
    }
    else if(m>=45){
        m = m-45;
    }
    System.out.println(h);
    System.out.println(m);
}}
