import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        System.out.println("=== PREDIKAT NILAI MAHASISAWA===");
        System.out.print("Masukkan nama:");
        String nama=q.nextLine();
        System.out.print("Masukkan nilai:");
        double nilai=q.nextDouble();

        System.out.println("=== PREDIKAT NILAI MAHASISWA ===");
        System.out.println("Nama:"+nama);
        System.out.println("Nilai:"+nilai);
        if (nilai>=85&&nilai<=100) {
            System.out.println("Predikat Nilai:A");
        }else if (nilai>=75&&nilai<=84) {
            System.out.println("Predikat Nilai:B");
        }else if(nilai>=65&&nilai<=74){
            System.out.println("Predikat Nilai:C");
        }else if (nilai>=50&&nilai<=64) {
            System.out.println("Predikat Nilai:D");
        }else{
            System.out.println("Predikat Nilai:E");
        }
        if (nilai>=60) {
            System.out.println("Status=LULUS");
        }else{
            System.out.println("Status=TIDAK LULUS");
        }
        q.close();
    }
}
