import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int a;
        int hasil=0;
        int berapa=0;
        do {
            a=q.nextInt();
            hasil+=a;
            berapa++;
        } while (a>0);
        System.out.printf("hasil penjumlahan:%d\nangka yang dimaksukkan:%d",hasil,berapa);
        q.close();
    }
}
