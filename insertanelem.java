package ArrayProblems;
import java.util.*;
public class insertanelem{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k+1];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        System.out.print("Enter the element to be inserted : ");
        int s = kavi.nextInt();
        System.out.print("Enter the position to be inserted : ");
        int p = kavi.nextInt();
        for(int i =k;i>p-1;i--){
            arr[i] = arr[i-1];
        }
        arr[p-1] = s;
        for(int i =0;i<k+1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}