import java.util.Scanner;

public class icl21 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int skora=q.nextInt();
        int skorb=q.nextInt();
        int pelanggaranaa=q.nextInt();
        int pelanggaranab=q.nextInt();
        boolean disa=q.nextBoolean();
        boolean disb=q.nextBoolean();
        if (disa&&disb) {
            System.out.println("KEDUA PEMAIN DIDISKUALIFIKASI");
        } else if (skora>skorb) {
            System.out.println("A MENANG");
        }else if (skora<skorb) {
            System.out.println("B MENANG");
        }else if (pelanggaranaa>pelanggaranab) {
            System.out.println("B MENANG");
        }else if (pelanggaranaa<pelanggaranab) {
            System.out.println("A MENANG");
        }else{
            System.out.println("SERI");
        }
    }
}
