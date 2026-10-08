import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
    Scanner d= new Scanner(System.in);
    System.out.print("Masukkan nilai:");
    int q = d.nextInt();
    if (q<=-1) {
        System.out.println("BILANGAN NEGATIF");
    }else if (q==0) {
        System.out.println("BILANGAN NOL");
    }else{
        System.out.println("BILANGAN POSITIF");
    }
    d.close();
    }
}
