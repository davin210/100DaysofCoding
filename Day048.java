import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        System.out.print("Nilai A:");
        float a=q.nextFloat();
         System.out.print("Nilai B:");
        float b=q.nextFloat();
        System.out.println("""
                === PILIH TINDAKAN ===
                1. +
                2. - 
                3. *
                4. /
                5. %
                """);
        System.out.println("Tindakan :");
        int tindakan =q.nextInt();
        switch (tindakan) {
            case 1:
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case 2:
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case 3:
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case 4:
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            case 5:
                System.out.println(a+"%"+b+"="+(a%b));
                break;
        
            default:
                System.out.println("ERR");
                break;
        }

        q.close();
    }
}

