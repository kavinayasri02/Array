package ArrayProblems;
import java.util.*;
public class countallnegelem{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int [] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int count = 0;
        for(int i =0;i<k;i++){
            if(arr[i] < 0){
                count++;
            }
        }
        System.out.print("Count of negative elements: " + count);
    }
}