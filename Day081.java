import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        System.out.print("Masukkan jumlaah array:");
        int jumlah=q.nextInt();
        int[] array=new int[jumlah];
        System.out.println("=== MASUKKAN NILAI ARRAY");
        for (int j = 0; j < array.length; j++) {
            System.out.print("Masukkan nilaii indeks ke-"+j+":");
            array[j]=q.nextInt();
        }
        System.out.println("\n=== ARRAY YANG ANDA MASUKKAAN ===");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indeks ke-"+i+"="+array[i]);
        }
        q.close();
    }
}
