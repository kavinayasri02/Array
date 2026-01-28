
import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = kavi.nextInt();
        }
        System.out.println("Enter elements to be searched:");
        int key = kavi.nextInt();
        int index = -1;
        for(int i = 0;i<arr.length;i++){
        if(arr[i] == key){
            index = i;
            break;
        }
    }
            if(index != -1)
           System.out.println("Element found at index:" + index);
        else
            System.out.println("Element not found");
        }
        }
        /* LinearSearch algorithm
         12 23 34 45 56 
Enter elements to be searched:
23
Element found at index:1
*/