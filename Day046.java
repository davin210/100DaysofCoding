import java.util.Scanner;

public class day46 {
public static void main(String[] args) {
    Scanner q= new Scanner(System.in);
    System.out.println("""
            === MENU MAKANAN WARUNG AMBA ===
            1. Nasu Goreng (Rp. 15000)
            2. Mie Ayam (Rp. 18000)
            3. Bakso (Rp. 12000)
            4. Sate (Rp. 16000)
            5. Ayam Geprek(Rp. 10000)
            """);
    
    System.out.print("Masukkan pilihan\t:");
    int menu =q.nextInt();
    
    System.out.printf("=== PESANAN %s===\n");
    switch (menu) {
        case 1:
            System.out.println("""
                Nama menu: Nasi Goreng
                Harga: Rp15.000
             """);            
             break;
            case 2:
                 System.out.println("""
                     Nama menu: Mie Ayam
                     Harga: Rp18.000
                        """);         
                    break;
                case 3:
                    System.out.println("""
                        Nama menu: Bakso
                        Harga: Rp12.000
                        """);
                 break;
                     case 4:
                         System.out.println("""
                            Nama menu: Sate
                            Harga: Rp16.000
                         """);
                         break;
                         case 5:
                            System.out.println("""
                                Nama menu: Ayam Geprek
                                Harga: Rp10.000
                                """);
                                break;
        default:
            System.out.println("Menu Tidak Tersedia");
            break;
    
    }
    q.close();
    }    
}

