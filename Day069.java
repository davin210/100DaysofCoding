import java.util.Scanner;

public class day69 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        System.out.print("Masukkan nilai :");
        int a= q.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=a*2; j++) {
             System.out.print("* ");
            }
           System.out.println("*");
        }
        q.close();
    }
}
