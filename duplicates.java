import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int nigu = kavi.nextInt();
        int arr[] = new int[nigu];
        for(int i = 0;i<nigu;i++){
            arr[i] = kavi.nextInt();
        }
        System.out.println("Duplicates are:");
        for(int i = 0;i<nigu;i++){
            for(int j = i + 1;j<nigu;j++){
                if(arr[i] == arr[j]){
                System.out.print(arr[i] + " ");
                break;
            }
        }
    }
}
}
/* to find the duplicates
 5
 1 2 3 2 4 
Duplicates are: 2
*/