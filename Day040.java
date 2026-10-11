import java.util.Scanner;

public class evaluasi11 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        float a= q.nextFloat();
        int b = q.nextInt();
        int c=q.nextInt();
        if (a>=3.50&&b<=5000000) {
            System.out.println("BEASISWA PENUH");
        }else if (a>=3.00&&(b<=5000000||c>=2)) {
            System.out.println("BEASISWA PARSIAL");
        }else if (c>=3) {
            System.out.println("BEASISWA PRESTASI");
        }else{
            System.out.println("TIDAK LOLOS");
        }
    }
}
