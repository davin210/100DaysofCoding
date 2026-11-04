import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int a= q.nextInt();
        int b= 1;

        for (int i = a; i>=1; i--) {
            b*=i;
        }
        System.out.println(b);
        q.close();
    }
}
