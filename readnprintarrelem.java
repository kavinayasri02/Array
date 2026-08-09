import java.util.*;
public class readnprintarrelem{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]m1 = new int[k];
        for(int i =0;i<k;i++){
            m1[i]= kavi.nextInt();
        }
        for(int i =0;i<m1.length;i++){
            System.out.print(m1[i] + " ");
        }
    }
}