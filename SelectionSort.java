/*import java.util.*;
public class SelectionSort {
   public static void main(String[]args){
    Scanner kavi = new Scanner(System.in);
    int n = kavi.nextInt();
    int[]arr = new int[n];
    for(int i =0;i<n;i++){
        arr[i] = kavi.nextInt();
    }
    sort(arr);
    for(int x : arr){
        System.out.print(x + " ");
    }
    kavi.close();
}
    static void sort(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int minIdx = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] > arr[minIdx]){
                  minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}*/
import java.util.*;
public class SelectionSort {
   public static void main(String[]args){
    Scanner kavi = new Scanner(System.in);
    int n = kavi.nextInt();
    int[]arr = new int[n];
    for(int i =0;i<n;i++){
        arr[i] = kavi.nextInt();
    }
    sort(arr);
    for(int x : arr){
        System.out.print(x + " ");
    }
    kavi.close();
}
    static void sort(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int minIdx = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[minIdx]){
                  minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}