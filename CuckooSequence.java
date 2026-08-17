package HexawarePractice;
import java.util.*;
public class CuckooSequence {
     public static int cuckoo(int n){
        if(n==1)return 0;
        if(n==2)return 1;
        else 
            return 1*cuckoo(n-1) + 2*cuckoo(n-2) + 3 *1;
        }
         public static void main(String[]args){
            Scanner kavi = new Scanner(System.in);
            int n = kavi.nextInt();
            int result = cuckoo(n);
            System.out.print(result);
         }
     }  
