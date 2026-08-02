import java.util.*;
public class LinearSearch{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i]=kavi.nextInt();
        }
        System.out.print("Enter the target element to search for : ");
        int target = kavi.nextInt();
        int result = search(arr,target);
        if(result == -1)
            System.out.println("Element not found");
            else
                System.out.println("Element found at index: "+ result);
        }
        public static int search(int[]arr,int target){
            for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
            }return -1;
        }
        }
    