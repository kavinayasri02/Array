import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int dass = kavi.nextInt();
        int arr[] = new int[dass];
        for(int i=0;i<dass;i++){
            arr[i] = kavi.nextInt();
        }
        int i = 0, j = dass-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        System.out.println("Reversed Array:");
        for(int k = 0;k<dass;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
/* to reverse the array using same array
this works on shifting the array element
 8 
1 2 4 3 2 6 7 5
Reversed Array:
5 7 6 2 3 4 2 1 
*/