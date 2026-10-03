import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        System.out.println();
        int a= q.nextInt();
        int b=q.nextInt();
        System.out.println(!((a!=b)&&(a>b||++a==b)));
        q.close();
    }
}
