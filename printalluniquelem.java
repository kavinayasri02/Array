import java.util.*;
public class printalluniquelem{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]m = new int[k];
        for(int i =0;i<k;i++){
            m[i] = kavi.nextInt();
        }
        for(int i =0;i<k;i++){
            boolean isUnique = true;
          for(int j=0;j<i;j++){
            if(m[i] == m[j]){
                isUnique = false;
                break;
                } 
            }
            if(isUnique){
                System.out.print(m[i]);
            }
          }
        }
    }
    