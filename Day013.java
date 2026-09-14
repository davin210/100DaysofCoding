import java.util.Scanner;

public class evaluasi5 {
    public static void main(String[] args) {
        Scanner da =new Scanner(System.in);
        System.out.println("===BIO DATA===");

        System.out.print("Nama Lengkap :");
        String namaLengkap =da.nextLine();
        System.out.print("NIM:");
        String nim =da.nextLine();
        System.out.print("umur :");
        int umur =da.nextInt();
        System.out.print("tinggi Badan :");
        double tinggi =da.nextDouble();
        System.out.print("Jenis kelaminn :");
        char jenis=da.next().charAt(0);

        System.out.println("\t===BIODATA MAHASISWA===");
        System.out.println("Nama  Lengkap \t:"+namaLengkap);
        System.out.println("NIM \t\t:"+nim);
        System.out.println("Umur \t\t:"+umur+" tahun");
        System.out.println("Tinggi Badan \t:"+tinggi+"cm");
        System.out.println("Jenis Kelamin \t:"+jenis);
        da.close();
    }
} 
import java.util.Scanner;

public class evaluasi4 {
    public static void main(String[] args) {
        Scanner da= new Scanner(System.in);
        System.out.print("umur :");
        int umur= da.nextInt();
        System.out.println("tinggi :");
        double tinggi = da.nextDouble();
        da.nextLine();
        System.out.println("nim :");
        final String nim = da.nextLine();
        

        System.out.printf("umur saya =%d\n",umur);
        
        System.out.printf("tinggi saya =%f\n",tinggi);
        
        System.out.printf("Nim saya =%s\n",nim);
         da.close();
    }
}
