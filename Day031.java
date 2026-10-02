import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println();
        int a = q.nextInt();
        int b = q.nextInt();
        int c = q.nextInt();
        int d = q.nextInt();
        System.out.println(a>b&&c>=d);
        System.out.println(a>b||c>=d);
        System.out.println(!(a>=b));
        q.close();
    }
}
