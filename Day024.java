import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("=== MENENTUKAN LUAS SEBUAH PERSEGI PANJANG ===");
        System.out.println("Masukkan panjang persegi panjang:");
        int panjang =d.nextInt();
        System.out.println("Masukkan lebar persegi panjang:");
        int lebar =d.nextInt();
        System.out.println("=== HASILNYA ===");
        System.out.println("luas persegi panjang = "+(panjang*lebar));
        d.close();
    }
}
