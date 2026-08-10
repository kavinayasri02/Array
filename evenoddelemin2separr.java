package ArrayProblems;
import java.util.*;
public class evenoddelemin2separr{
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int[]evenarr = new int[k];
        int[]oddarr = new int[k];
        int even = 0,odd = 0;
        for(int i =0;i<k;i++){
            if(arr[i] % 2 == 0){
              evenarr[even] = arr[i];
              even++;
            }else{
                oddarr[odd] = arr[i];
                odd++;
            }
            }
            System.out.print("Even elements : ");
            for(int i=0;i<even;i++){
                System.out.print(evenarr[i] + " ");
            }
            System.out.print("Odd elements : ");
            for(int i=0;i<odd;i++){
                System.out.print(oddarr[i] + " ");
            }
        }
    }