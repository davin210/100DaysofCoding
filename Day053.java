import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int a=q.nextInt();
        do {
            System.out.println(a++);
        } while (a<=5);
        q.close();
    }
}
