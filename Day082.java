import java.util.Scanner;
public class day82 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int n=q.nextInt();
        int []ray=new int[n];
        int tam=Integer.MIN_VALUE;
        for (int i = 0; i < ray.length; i++) {
            ray[i]=q.nextInt();
        }
        for (int i = 0; i < ray.length-1; i++) {
            if (tam<ray[i]+ray[i+1]) {
                tam=ray[i]+ray[i+1];
            }
        }
        System.out.println(tam);
    }
}
