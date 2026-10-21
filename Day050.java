import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        System.out.println("");
        int a=q.nextInt();
        String hasil = (a%2==0)?"Genap":"Ganjil";
        System.out.println(hasil);
        q.close();
    }
}
