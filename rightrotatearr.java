package ArrayProblems;
import java.util.*;
public class rightrotatearr{
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        System.out.print("Enter number of rotations (r) : ");
        int r = kavi.nextInt();
        r = r%k;
        int[] temp = new int[k];
        int tempIndex = 0;
        for(int i =k-r;i<k;i++){
           temp[tempIndex] = arr[i];
           tempIndex++;
        }
        for(int i =0;i<k-r;i++){
           temp[tempIndex] = arr[i];
           tempIndex++;
        }
        for(int i =0;i<k;i++){
            arr[i] = temp[i];
        }
        System.out.println("Elements after r Right rotation:");
        for(int i =0;i<k;i++){
          System.out.println(arr[i] + " ");
        }
    }
}