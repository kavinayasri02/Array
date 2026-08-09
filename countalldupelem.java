package ArrayProblems;
import java.util.*;
public class countalldupelem{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int count = 0;
        for(int i =0;i<k;i++){
            for(int j =i+1;j<k;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        }
        System.out.print("Count of duplicate elements: " + count);
    }
}