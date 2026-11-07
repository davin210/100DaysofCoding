import java.util.Scanner;

public class day67 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        System.out.print("Masukkan PanjangxLebar: ");
        int a= q.nextInt();
        
        for (int i = 1; i <=a; i++) {
           for (int j = 1; j <=a; j++) {
            System.out.print("* ");
           }
           System.out.println();
        }
        q.close();
    }
}
