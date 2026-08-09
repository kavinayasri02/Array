package ArrayProblems;
import java.util.*;
public class countallevenoddelem{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in); 
        int k = kavi.nextInt();
        int [] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = kavi.nextInt();
        }
        int even= 0,odd =0;
        for(int i =0;i<k;i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.print("Count of even elements: " + even);
        System.out.print("\nCount of odd elements: " + odd);
    }
}