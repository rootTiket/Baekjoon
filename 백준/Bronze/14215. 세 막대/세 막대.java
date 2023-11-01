import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);
        int third = Integer.parseInt(input[2]);
        int[] dot = {first,second,third};
        Arrays.sort(dot);
        if(dot[0]+dot[1] > dot[2]){
            System.out.println(first+second+third);
        }else{
            System.out.println((dot[0]+dot[1]) * 2 - 1);
        }
    }
}