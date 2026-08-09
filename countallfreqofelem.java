package ArrayProblems;
import java.util.*;
public class countallfreqofelem{
    public static void main(String[] args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int [] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = kavi.nextInt();
        }
        for(int i = 0; i < k; i++){
            int count = 0;
            for(int j = 0; j < k; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println("Frequency of " + arr[i] + ": " + count);
        }
    }
}   