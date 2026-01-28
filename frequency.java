import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int size = kavi.nextInt();
        int arr[]= new int[size];
        for(int i =0;i<size;i++){
            arr[i] = kavi.nextInt();
        }
        int count = 0;
        int target = kavi.nextInt();
        for(int i =0;i<size;i++){
            if(arr[i] == target)
            count++;
        }
        System.out.print("count:"+ count);
    }
}
/*to find the frequency of a number
7 
1 2 4 3 2 7 2
2
count:3
 */
