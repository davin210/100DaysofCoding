import java.util.Scanner;

public class day88 {
    public static void hai() {
        System.out.println("== SELAMAT DI PROGRAM JAVA SAYA==");
    }
    public static void cekbiodata(String nama,int umur) {
        System.out.println("Nama: "+nama);
        System.out.println("umur: "+umur+" Tahun");
        
    }
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        hai();
        System.out.print("Nama :");
        String nama=q.nextLine();
        System.out.print("Umur :");
        int umur=q.nextInt();
        cekbiodata(nama, umur);
    }
}
