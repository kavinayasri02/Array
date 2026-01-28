import java.util.Scanner;
public class Evenindexpos {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int size = kavi.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<=size;i++){
            arr[i] = kavi.nextInt();
        }
        System.out.println("Even index position elements are : ");
        for(int i = 0; i<=size;i+=2){
        System.out.print(arr[i]+ " ");
        }
    }
}
/* 5 
1 2 3 4 5
Even index position elements are : 
1 
3
5
*/