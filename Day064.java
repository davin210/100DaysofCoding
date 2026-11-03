import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int a= q.nextInt();
        int b= q.nextInt();

        for (int i = 1; i <=a; i++) {
            b*=i;
        }
        System.out.println(b);
        q.close();
    }
}
