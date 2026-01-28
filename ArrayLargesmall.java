import java.util.Scanner;
public class ArrayLargesmall {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int size = kavi.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = kavi.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i =1;i<size;i++){
            if(arr[i] > max){
                max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
    }
}
        System.out.println("Largest number:" + max);
        System.out.println("Smallest number:" + min);
    }
}
/* to print large n small num in an array
4
 23 41 13 2 
Largest number:41
Smallest number:2
*/