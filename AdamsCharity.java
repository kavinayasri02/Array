package HexawarePractice;
import java.util.*;
/*public class AdamsCharity {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int days = kavi.nextInt();
        int sum1 =0;
        for(int i =0;i<=days;i++){
            sum1 += (int)Math.pow(i,2);
        }System.out.print(sum1);
    }
}*/
public class AdamsCharity{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        long n = kavi.nextLong();
        long coins = n*(n+1)*(2*n+1)/6;
        System.out.println(coins);
    }
}