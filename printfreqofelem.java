import java.util.*;
public class printfreqofelem {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]s = new int[k];
        for(int i =0;i<k;i++){
            s[i] = kavi.nextInt();
        }
        for(int i =0;i<k;i++){
            int count =0;
            for(int j = 0;j<k;j++){
               if(s[i]==s[j]){
                count++;
               }
            }
            if(count == 1){
               System.out.print(s[i] + " ");
            }
        }
    }
}
