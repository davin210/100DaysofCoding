import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
       Scanner q= new Scanner(System.in);
       String h= q.nextLine();
       System.out.println(h.length());
    //    menghitung huruf yang ada
       System.out.println(h.toUpperCase());
    //    membuat huruf menjadi kapital semua
       System.out.println(h.toLowerCase());
    //    membuat huruf menjadi kecil semua
    q.close();
    }
}
