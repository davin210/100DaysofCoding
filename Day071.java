import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int a=q.nextInt();
        for(int i=a;i>=1;i-=1){
            for (int j = i; j >=1; j-=1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        q.close();
    }
}
