import java.util.Scanner;
public class Arraysum_avg {
    public static void main(String[] args) {
        Scanner naya = new Scanner(System.in);
        int size = naya.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for(int i = 0;i<size;i++){
         arr[i] = naya.nextInt();
         sum = sum + arr[i];
        }
        double avg = (double) sum/size;
        System.out.println("sum:"+ sum);
        System.out.println("avg:"+ avg);
        }
    }
    /* to fine the sum and avg of an array
     4
2 4 6 8
sum:20
avg:5.0
*/