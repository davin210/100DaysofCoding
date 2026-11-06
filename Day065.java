import java.util.Scanner;

public class day66 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int a=q.nextInt();
        for (int i = 1; i <=a; i++) {
            System.out.print("*");
        }
        q.close();
    }
}
