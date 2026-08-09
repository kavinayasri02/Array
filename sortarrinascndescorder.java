package ArrayProblems;
import java.util.*;
public class sortarrinascndescorder{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int []arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorted in Ascending Order: ");
        for(int i =0;i<k;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Sorted in Descending Order:");
        for(int i =k-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
