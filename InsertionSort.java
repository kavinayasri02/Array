import java.util.*;
 public class InsertionSort{
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i]=kavi.nextInt();
        }
        sort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
        static void sort(int[]arr){
            int k = arr.length;
            for(int i = 1;i<k;i++){
                int key = arr[i];
                int j = i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = key;
            }
        }
    }