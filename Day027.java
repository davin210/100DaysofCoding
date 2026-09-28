import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner d = new Scanner (System.in);
        System.out.println();
        int a = d.nextInt();
        int b = d.nextInt();
        System.out.println(++a);
        System.out.println(--b);
        d.close();
    }
}
