import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int n =q.nextInt();
        int m = q.nextInt();
        for (int i = 1; i<=n; i+=m) {
            System.out.print(i+" ");
        }
        q.close();
    }
}
