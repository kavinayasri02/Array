import java.util.*;
public class deletealldupelem{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int newSize = k;
        for(int i =0;i<newSize;i++){
            for(int j =i+1;j<newSize;j++){
            if(arr[i] == arr[j]){
             for(int s = j;s<newSize - 1;s++){
                arr[s] = arr[s+1];
             }
             newSize--;
             j--;
            }
        }
    }
    for(int i =0;i<newSize;i++){
        System.out.print(arr[i] + " ");
    }
    }
}