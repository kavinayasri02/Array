import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int a = kavi.nextInt();
        int b = kavi.nextInt();
        int sum = a + b;
        if(sum%2 == 0){
            System.out.println(sum +" is even");
        }else{
            System.out.println(sum +" is odd");
        }
    }
}
output : 11 is odd
    12 is even
