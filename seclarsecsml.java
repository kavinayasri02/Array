import java.util.Scanner;
public class seclarsecsml {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int nig = kavi.nextInt();
        int arr[] = new int[nig];
        for(int i =0;i<nig;i++){
            arr[i] = kavi.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int seclargenum = Integer.MIN_VALUE;
        int secsmallnum = Integer.MAX_VALUE;
        for(int i=1;i<nig;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > seclargenum && arr[i]!=max){
            seclargenum = arr[i];
}
            if(arr[i] < secsmallnum && arr[i] != min){
            secsmallnum = arr[i];
}
        }
if(seclargenum == Integer.MIN_VALUE)
    System.out.println("No second largest found");
else
    System.out.println("Second largest number: " + seclargenum);

if(secsmallnum == Integer.MAX_VALUE)
    System.out.println("No second smallest found");
else
    System.out.println("Second smallest number: " + secsmallnum);
    }
}
/*To find the second largest and smallest number in an array 
 5
1 4 8 3 6 
Second largest number: 6
Second smallest number: 3
*/