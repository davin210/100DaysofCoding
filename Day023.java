import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner d= new Scanner(System.in);
        System.out.print("Masukkin sisi1 :");
        int sisi1 = d.nextInt();
        System.out.print("Masukkin sisi2 :");
        int sisi2 = d.nextInt();
        System.out.println("luas persegi ="+(sisi1*sisi2));
        d.close();
    }
}
