import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
    Scanner d =new Scanner(System.in);
    System.out.println("=== KALKULATOR ===");
    System.out.print("nilai A:");
    int nilaiA =d.nextInt();
    System.out.print("nilai B:");
    int nilaiB =d.nextInt();
    System.out.println();
    System.out.println("""
            1. /
            2. *
            3. +
            4. -
            5. %
            """);
    System.out.print("pilih tindakan anda:");
    long tindakan =d.nextLong();
        if (tindakan==1) {
                 System.out.println(nilaiA/nilaiB);
            }else if (tindakan==2) {
                 System.out.println(nilaiA*nilaiB);
            }else if (tindakan==3) {
                 System.out.println(nilaiA+nilaiB);
            }else if (tindakan==4) {
                System.out.println(nilaiA-nilaiB);
            }else if (tindakan==5) {
               System.out.println(nilaiA%nilaiA);
            }else{
                 System.out.println("ERR");
            }
    d.close();
    }
}
