package ArrayProblems;
import java.util.*;
public class copyallelemto2arr{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int [] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int[]arr2 = new int[k];
        for(int i =0;i<k;i++){
            arr2[i] = arr[i];
        }
        for(int i =0;i<k;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}