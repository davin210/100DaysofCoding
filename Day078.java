import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
      Scanner q=new Scanner(System.in);
      System.out.println("=== DAFTAR AKUN  SEBAGAI MAHASISWA/ADMIN ===");
      System.out.print("Provesi: ");
      String pr=q.nextLine();
     if (pr.equalsIgnoreCase("mahasiswa")) {
       System.out.println("=== DAFTAR AKUN MAHASISWA ===");
      System.out.print("User\t:");
      String userM = q.nextLine();
      System.out.print("Pasword\t:");
      String pwM =q.nextLine();
      System.out.println("\n selamat akun anda berhasil di buat \n");
      String userlogin;
      String pwlogin;
      do {
      System.out.println("=== LOGIN AKUN MAHASISWA UNSULBAR ===");
      System.out.print("User\t:");
      userlogin =q.nextLine();
      System.out.print("Pasword\t:");
      pwlogin=q.nextLine();
      if (!userlogin.equals(userM)||!pwlogin.equals(pwM)) {
        System.out.println("=== AKUN TIDAK DITEMUKAN");
      }
      } while (!userlogin.equals(userM)||!pwlogin.equals(pwM));
      System.out.println("Anda login sebagai mahasiswa");
     }
     if (pr.equalsIgnoreCase("admin")) {
       System.out.println("=== DAFTAR AKUN ADMIN ===");
      System.out.print("User\t:"); 
      String userA = q.nextLine();
      System.out.print("Pasword\t:");
      String pwA =q.nextLine(); 
      System.out.println("\n selamat akun anda berhasil di buat \n");
      String userlogin;
      String pwlogin;
      do {
      System.out.println("=== LOGIN AKUN ADMIN UNSULBAR ===");
      System.out.print("User\t:");
      userlogin =q.nextLine();
      System.out.print("Pasword\t:");
      pwlogin=q.nextLine();
      if(!userlogin.equals(userA)||!pwlogin.equals(pwA)){
        System.out.println("=== AKUN TIDAK DITEMUKAN ===");
      }
      } while (!userlogin.equals(userA)||!pwlogin.equals(pwA));
      System.out.println("Anda login sebagai admin");
     }
      q.close();
      
    }
}
