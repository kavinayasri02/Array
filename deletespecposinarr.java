import java.util.*;
public class deletespecposinarr{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int pos = kavi.nextInt();
        if(pos < 1 || pos > k){
            System.out.println("Invalid position");
            return;
        }
        for(int i = pos-1;i<k-1;i++){
            arr[i] = arr[i+1];
        }
        for(int i =0;i<k-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}