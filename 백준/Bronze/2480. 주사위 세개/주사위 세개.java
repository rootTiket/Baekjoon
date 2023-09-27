import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int []dice = new int[3];
    int result=0;
    for(int i = 0 ; i<dice.length;i++){
        dice[i] = scan.nextInt();
    }
    if(dice[0]==dice[1]&&dice[0]==dice[2]){
        result = 10000;
        result +=1000*dice[0];
    }
    else if(dice[0]==dice[1]){
        result = 1000;
        result += 100*dice[0];
    }
    else if(dice[0]==dice[2]){
        result = 1000;
        result += 100*dice[0];
    }
    else if(dice[2]==dice[1]){
        result = 1000;
        result += 100*dice[1];
    }
    else{
        int cnt=dice[0];
        for(int i =1;i<dice.length;i++){
            if(cnt<dice[i]){
                cnt = dice[i];
            }
        }
        result += 100*cnt;
    }
    System.out.println(result);
}}
