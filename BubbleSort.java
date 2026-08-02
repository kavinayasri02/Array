import java.util.*;
public class BubbleSort {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        sort(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    static void sort(int[]arr){
        int k = arr.length;
        for(int i = 0;i<k-1;i++){
            boolean swapped = false;
            for(int j =0;j<k-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
    }
}
