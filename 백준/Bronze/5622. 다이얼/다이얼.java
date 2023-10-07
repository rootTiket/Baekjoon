import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;
        for(char c : s.toCharArray()){
            cnt +=2;
            if((int)c>=65&&(int)c<=67){
                cnt+=1;
            }
            else if((int)c>=68&&(int)c<=70){
                cnt+=2;
            }else if((int)c>=71&&(int)c<=73){
                cnt+=3;
            }
            else if((int)c>=74&&(int)c<=76){
                cnt+=4;
            }
            else if((int)c>=77&&(int)c<=79){
                cnt+=5;
            }
            else if((int)c>=80&&(int)c<=83){
                cnt+=6;
            }
            else if((int)c>=84&&(int)c<=86){
                cnt+=7;
            }
            else if((int)c>=87&&(int)c<=90){
                cnt+=8;
            }
        }
        System.out.println(cnt);
}
}