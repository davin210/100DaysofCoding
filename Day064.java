import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int a= q.nextInt();
        int b= 1;

        for (int i = a; i>=1; i--) {
            b*=i;
        }
        System.out.println(b);
        q.close();
    }
    public static int faktorial(int n){
        return (n <= 1) ? 1 : n * faktorial(n - 1);
    }
    public static void kaka(String[]args){
        Scanner h=new Scanner(System.in);
        int no =h.nextInt();
        System.out.println(faktorial(no));
    }
}
