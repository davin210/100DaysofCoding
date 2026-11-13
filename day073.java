import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        System.out.println("""
                === MENU RESTO AMBA ===
                1. Ayam Geprek
                2. Ayam Bakar
                3. Ayam Goreng
                4. Ayam Madu
                5. Ayam Goreng Bawang Putih
                """);
        int menu;
        
        System.out.println("\n\n=== PESANAN RESTO AMBA ===");
        System.out.print("Nama: ");
        String nama= q.nextLine();
        int i=1;
        int ii=1;
        int iii=1;
        int iv=1;
        int v=1;
        do {
            menu=q.nextInt();  
                switch (menu) {
                case 1:
                    System.out.printf("Total %d Ayam Geprek\n",i);
                    i++;
                    break;
                case 2:
                    System.out.printf("Total %d Ayam Bakar\n",ii);
                    ii++;
                    break;
                case 3:
                    System.out.printf("Total %d Ayam Geprek\n",iii);
                    iii++;
                    break;
                case 4:
                    System.out.printf("Total %d Ayam Goreng\n",iv);
                    iv++;
                    break;
                case 5:
                    System.out.printf("Total %d Ayam Goreng Bawang Putih\n",v);
                    v++;
                    break;
                case 0:
                    System.out.println("===PESANAN ANDA AKAN KAMMI PROSES===");
                    break;
                default:
                    System.out.println("MAAF MENU BELUM TERDAFTAR");
                    break;
                }
        } while (menu>0||menu<0);
        
        q.close();
    }
}
