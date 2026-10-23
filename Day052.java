import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        System.out.println();
        int a= q.nextInt();
        while (a<=5) {
            System.out.println(a++);
        }
        q.close();
    }
}
