import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("""
            === MENU RESTO AMBA ===
                1. ayam geprek
                2. ayam bakar madu
                3. udang saos padang
                4. nasi goreng
        """);
        System.out.print("Masukkan no menu:");
        int menu  =d.nextInt();
        System.out.println("=== PESANAN ANDA ADALAH ===");
        if (menu==1) {
            System.out.println("Ayam geprek");
        }else if (menu==2) {
            System.out.println("ayam bakar madu");
        }else if (menu==3) {
            System.out.println("udang saus padang");
        }else {
            System.out.println("nasi goreng");
        }
        d.close();
    }
}
