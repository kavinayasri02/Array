import java.util.Scanner;
public class Arrayeven {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int size = kavi.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = kavi.nextInt();
        }
        System.out.print("Even numbers are:");
        for(int i=0;i<size;i++){
            if(arr[i]%2 == 0)
            System.out.print(arr[i]+ " ");
        }
    }
}
//to get an array as input & print the even nums
/* 6
1 2 3 4 5 6
Even numbers are:2 4 6 */