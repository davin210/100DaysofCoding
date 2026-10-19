import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        float a=q.nextFloat();
        char simbol=q.next().charAt(0);
        float b=q.nextFloat();
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
