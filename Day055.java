import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int a=q.nextInt();
        for (int i = a; i <=5; i++) {
            if (i==3){
                continue;
            }
            System.out.println(i);
            // menhilangkan
        }
         for (int i = a; i <=5; i++) {
            if (i==3){
                break;
            }
            System.out.println(i);
        }
        // menhentikan
            if (a==3){
                return;
            }
            System.out.println("HENTIKAN PEROGRAM");
            q.close();
    }
}
