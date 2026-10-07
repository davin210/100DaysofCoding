import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("=== PENENTUAN NILAI GANJIL DENGAN GENAP ===");
        System.out.print("Masukkan nilai:");
        int milai =d.nextInt();
        
        if (milai%2==0) {
            System.out.println("BILANGAN GENAP");
        }else{
            System.out.println("BILANGAN GANJIL");
        }
        
        d.close();
    }
}
