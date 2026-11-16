import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
        Scanner q=new Scanner (System.in);
        String a= q.nextLine();
        String b=q.nextLine();
        System.out.println(a.substring(1));
        // menghilangkan huruf pada karakter 1
        System.out.println(a.replace(a, b));
        // menganti variabel
        System.out.println(a.trim());
        // menghilangkang spasi di awal dan di akhir
        q.close();
    }
}
