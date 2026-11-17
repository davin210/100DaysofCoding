import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner q= new Scanner (System.in);
        System.out.println("===BUAT AKUN MEMBER AMBA===");
        System.out.print("Nama: ");
        String nama = q.nextLine();
        System.out.print("User: ");
        String user= q.nextLine();
        System.out.print("Pasword:");
        String pw= q.nextLine();

        String userlog;
        String pwlog;
        
        do {
            System.out.println("=== LOGIN MEMBER AMBA ==="); 
            
            System.out.print("User:");
            userlog=q.nextLine();
            System.out.print("Pasword:");
            pwlog=q.nextLine();
            if (userlog.isEmpty()) {
                System.out.println("=== USER KOSONG ===");
            }
            if (pwlog.isEmpty()) {
                System.out.println("=== PASWORD KOSONG ===");
            }
        } while (!user.equals(userlog)||!pw.equals(pwlog));
        System.out.println();
        System.out.println("=== SELAMAT DATANG ===");
        System.out.println(nama.toUpperCase());

        q.close();
    }
}
