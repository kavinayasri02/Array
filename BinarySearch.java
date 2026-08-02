import java.util.*;
public class BinarySearch {
    public static void main(String[]args){
        Scanner kavi = new Scanner (System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        System.out.print("Enter the element wanted to be searched:");
        int target = kavi.nextInt();
        int low = 0;
        int high = k-1;
        int resultIndex = -1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                resultIndex = mid;
                break;
            }else if(arr[mid] < target){
                    low = mid + 1;
                }else{
                        high = mid -1;
                    }
            }
            if(resultIndex != -1){
                System.out.println("Element found at index: "+ resultIndex);
            }else{
                System.out.println("Element not found in the array");
            }
        }
    }
