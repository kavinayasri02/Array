package HexawarePractice;
import java.util.Scanner;
public class MaxProfit {
    public static void main(String[]args){
    Scanner kavi = new Scanner(System.in);
    int k = kavi.nextInt();
    int[]prices = new int[k];
    for(int i=0;i<k;i++){
        prices[i]=kavi.nextInt();
    }
    int minPrice = prices[0];
    int maxProfit = 0;
    for(int i =1;i<k;i++){
        if(prices[i]<minPrice){
            minPrice = prices[i];
        }else{
            maxProfit = Math.max(maxProfit,prices[i]-minPrice);
        }
    }System.out.println(maxProfit);
    }
}