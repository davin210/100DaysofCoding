import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        System.out.println("""
            -masukkan 4 untuk main
            -masukkan 3 untuk keluar dari permainan
            """);
        int a= q.nextInt();
        switch (a) {
            case 3:
                System.out.println("keluar dari permainan");
                break;
                case 4:
                    System.out.println("main");
                break;
            default :
            System.out.println("Yang benr njit");
                break;
        }
        q.close();     
    }
}
