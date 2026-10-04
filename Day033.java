import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.print("buat perbandingan antar nilai a dengan b:");
        int a =d.nextInt();
        int b =d.nextInt();
        if (a>b) {
            System.out.println("A lebih besar di bandingkan B");
        }else{
            System.out.println("A lebih kecil dibandingkan B");
        }
        d.close();
    }
}
