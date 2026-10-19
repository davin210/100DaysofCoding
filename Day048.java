import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        int a=q.nextInt();
        char simbol=q.next().charAt(0);
        int b=q.nextFInt();
        System.out.println("===Kalkulator Sederhana===");
        switch (simbol) {
            case '+':
                System.out.println("Hasil dari "+a +"+"+b+" adalah "+(a+b));
                break;
            case '-':
                System.out.println("Hasil dari "+a +"-"+b+" adalah "+(a-b));
                break;
            case '*':
                System.out.println("Hasil dari "+a +"*"+b+" adalah "+(a*b));
                break;
            case '/':
                System.out.println("Hasil dari "+a +"/"+b+" adalah "+(a/b));
                break;
            case '%':
                System.out.println("Hasil dari "+a +"%"+b+" adalah "+(a%b));
                break;
            default:
                break;
        }
        q.close();
    }
}
