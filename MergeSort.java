import java.util.*;
public class MergeSort {
    public static void main(String[]args){
        Scanner kavi =new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i = 0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        sort(arr,0,k-1);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    static void sort(int[]arr,int left, int right){
        if(left >= right)return;
        int mid = left +(right - left)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left, mid , right);
    }
    static void merge(int[]arr,int left,int mid,int right){
        int[]temp = new int[right-left+1];
        int i = left;
        int j = mid + 1;
        int k1 = 0;
        while(i<=mid && j<= right){
            if(arr[i] <= arr[j]){
                temp[k1++] = arr[i++];
            }else{
                temp[k1++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k1++] = arr[i++];
        }
        while(j<=right){
            temp[k1++] = arr[j++];
        }
        for(int x = 0;x<temp.length;x++){
            arr[left+x] = temp[x];
        }
    }
}
