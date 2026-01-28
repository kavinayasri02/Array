import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int sri = kavi.nextInt();
        int arr[] = new int[sri];
        for(int i = 0;i<sri;i++){
            arr[i] = kavi.nextInt();
        }
        int size = sri;
        for(int i =0;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(arr[i] == arr[j]){
                    for(int k = j; k < size-1;k++){
                        arr[k] = arr[k+1];
                    }
                    size--;
                    j--;
                }
            }
        }
        System.out.println("Array after removing the duplicates:");
        for(int i =0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
/*  to remove duplicates in an array using the same array 
this works on sorting method
7
1 2 3 2 4 5 2
Array after removing the duplicates:
1 2 3 4 5 
*/