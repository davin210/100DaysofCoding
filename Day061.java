import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int a= q.nextInt();
        int hasil=1;
        for (int i = 1; i <=a; i++) {
            hasil*=i;
        }
        System.out.println(hasil);
        q.close();
    }
}
