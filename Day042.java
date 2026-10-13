import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        System.out.println("=== NOTA GAJI BULANAN ===");
        System.out.print("Nama\t\t:");
        String nama = q.nextLine();
        System.out.print("Jabatan\t\t:");
        String jabatan =q.nextLine();
        System.out.print("Total jam lembur:");
        int lembur =q.nextInt();
        System.out.print("Total jam kerja\t:");
        int jam =q.nextInt();
        System.out.print("Denda\t\t:");
        int denda =q.nextInt();
        System.out.println("=== TOTAL GAJI ANDA ===");
        System.out.println("Nama\t :"+nama);
        System.out.println("Jabatan\t :"+jabatan);
        if (jabatan=="karyawan") {
            System.out.println("Gaji\t :"+(200000*jam*lembur-denda));
        }else if (jabatan=="ceo") {
            System.out.println("Gaji\t :"+(90000*jam*lembur-denda));
        }else{
            System.out.println("Gaji\t :"+(15000*jam*lembur-denda));
        }
        q.close();
    }
}
