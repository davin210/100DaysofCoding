import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner d= new Scanner(System.in);
        System.out.println();
        int a = d.nextInt();
        System.out.println((a/3600)+" jam "+(a%3600/60)+" menit "+(a%60)+" detik");
    }
}
