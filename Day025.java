import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("=== Mencari luas lingkaran");
        final float pi = 3.14f;
        System.out.println("Masukkan nilai r:");
        int r =d.nextInt();
        System.out.println("luas lingkaran ="+(pi*r*r));
        d.close();
    }
}
