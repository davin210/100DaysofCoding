import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner d = new  Scanner(System.in);

        System.out.print("masukkan nilai A:");
        int A = d.nextInt();
        System.out.print("Masukkan nilai B:");
        int B = d.nextInt();
         int da = A;
        A = B;
        B = da;
        System.out.println("=== NILAI ANDA AKAN KAMI TUKAR ===");
        System.out.println("Nilai A:"+A);
        System.out.println("Nilai B:"+B);
        d.close();
    }
}
