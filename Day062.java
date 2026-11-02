import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int a= q.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.println(j);
            }
            System.out.println();
        }
        q.close();
    }
}
