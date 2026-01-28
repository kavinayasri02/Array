import java.util.Scanner;
public class duplicatescount {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int naya = kavi.nextInt();
        int arr[] = new int[naya];
        for(int i = 0;i<naya;i++){
            arr[i] = kavi.nextInt();
        }
        int target = kavi.nextInt();
        int count = 0;
        for(int i = 0;i<naya;i++){
         if(arr[i]== target){
            count++;
         }
        }
         System.out.print("The count of duplicates are:" + count);
        }
    }
/* to find the count of duplicate values
7
1 2 3 2 4 5 2
2
The count of duplicates are:3 
*/