import java.util.Scanner;
public class OddEvenNum{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int n = kavi.nextInt();
        if(n%2 == 0){
            System.out.println(n +" is even");
        }else{
            System.out.println(n +" is odd");
        }
    }
}

Output : 5 is odd 
    6 is even
