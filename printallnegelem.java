import java.util.*;

public class printallnegelem {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[] p = new int[k];
        for (int i = 0; i < k; i++) {
            p[i] = kavi.nextInt();
        }
        for (int i = 0; i < k; i++) {
            if (p[i] < 0) {
                System.out.print(p[i]);
            }
        }
    }
}