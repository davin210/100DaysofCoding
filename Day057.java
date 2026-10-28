import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int n= q.nextInt();
      System.out.print("Genap:");
    for (int i = 1; i<=n; i++) {
      if (i%2==0) {
        System.out.print(i+", ");
      }
    }
    System.out.println();
    System.out.print("Ganjil:");
    for (int i = 1; i <=n; i++) {
      if (i%2==1) {
        System.out.print(i+", ");
      }
    }
    q.close();
  }
}
