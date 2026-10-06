import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner d= new Scanner(System.in);
        System.out.println("=== SYARAT PEMBUATAN SIM ===");
        System.out.print("masukkan umur anda:");
        int umur = d.nextInt();
        System.out.print("Anda memiliki KTP?:");
        boolean ktp =d.nextBoolean();
        if(umur>=17) {
            System.out.println("anda memenuhi syarat umur");
            if(ktp==true) {
            System.out.println("anda memenuhi syarat berkas");
                }else{
            System.out.println("anda harus membuat ktp terlebih dahulu");
            }
        }else{
        System.out.println("balik lagi kalo dah cukup umur");
        }

        d.close();
    }
}
