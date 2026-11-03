import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        double m =q.nextDouble();
        double n =q.nextDouble();
        double hasil =Math.pow(m,n);
        System.out.println(hasil);
        int hasil2=1;
        int N=(int)n;
        int M=(int)m;
        for (int i = 1; i <=N; i++) {
            hasil2*=M;
        }
        System.out.println(hasil2);
        q.close();
    }
}

