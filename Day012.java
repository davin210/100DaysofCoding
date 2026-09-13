import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
       Scanner d  = new Scanner(System.in);
        String nama,alamat;
        int tanggalLahir,umur;

        System.out.print("nama:");
        nama =d.nextLine();
        System.out.print("alamat:");
        alamat =d.nextLine();
        System.out.print("tanggal lahir:");
        tanggalLahir =d.nextInt();
        System.out.print("umur:");
        umur =d.nextInt();

        System.out.println("salam kenal saya "+nama);
        System.out.println("saya berasal "+alamat);
        System.out.println("tanggal lahir saya "+tanggalLahir);
        System.out.println("dan umur saya "+umur);
        d.close(); 
    }
}
