import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char []ca = s.toCharArray();
        char []ca1 = new char[ca.length];
        int flag=0 ;
        for(int i = 0; i<ca.length;i++){
            ca1[i] = ca[ca.length-1-i];
            if(ca[i] == ca1[i]) {
                flag += 1;
            }
        }
        if(flag == ca.length){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

}}