package HexawarePractice;
import java.util.*;
public class longestOddword {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        String res = "";
        for(int i =0;i<k;i++){
            String s = kavi.next();
            if(s.length()%2!=0 && s.length() > res.length()){
                res = s;
            }
        }System.out.println(res.isEmpty() ? "Better luck next time": res);
    }
}
