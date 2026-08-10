import java.util.*;
public class sumofarrelem{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]a = new int[k];
        int sum =0;
        for(int i =0;i<k;i++){
            a[i] = kavi.nextInt();
            sum += a[i];
        }
        System.out.print("The Sum of array elements are :" + sum);
    }
}