import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int n =q.nextInt();
        System.out.print("GENAP:");
        for (int i = n; i >=1; i--) {
         if (i%2==0) {
            System.out.print(i+",");
         }
        }
        System.out.println();
        System.out.print("GANJIL:");
        for (int i = n; i >=1; i--) {
         if (i%2==1) {
           
            System.out.print(i+",");
         }
        }
        q.close();
    }
}
