import java.util.Scanner;

public class d1 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int n=q.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1;j<=i; j++) {
              System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
