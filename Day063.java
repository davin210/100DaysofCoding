import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        double m =q.nextDouble();
        double n =q.nextDouble();
        double hasil =Math.pow(m, n);
        System.out.println(hasil);
        q.close();
    }
}
