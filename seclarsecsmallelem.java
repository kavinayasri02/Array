package ArrayProblems;
import java.util.*;
public class seclarsecsmallelem{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;
       
        for(int i =0;i<k;i++){
            if(arr[i] > seclarge){
                seclarge = largest;
                largest = arr[i];
            }
            else if(arr[i] > seclarge && arr[i] != largest){
                seclarge = arr[i];
            }
        }
        System.out.println("Second largest element: " + seclarge);
        int smallest = Integer.MAX_VALUE;
        int secsmall = Integer.MAX_VALUE;
        for(int i =0;i<k;i++){
            if(arr[i] < secsmall){
                secsmall = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secsmall && arr[i] != smallest){
                secsmall = arr[i];
            }
        }
        System.out.println("Second smallest element: " + secsmall);
    }
}