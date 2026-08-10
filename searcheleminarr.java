import java.util.*;
public class searcheleminarr{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int target = kavi.nextInt();
        int foundIndex = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                foundIndex = i;
                break;
            }
        }if(foundIndex != -1){
                System.out.println("Element found at index :" + foundIndex);
            }else{
                System.out.println("Element not found in the array");
            }
        }
    }