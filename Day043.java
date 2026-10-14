import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        System.out.println();
        int a= q.nextInt();
        if (a%3==0&a%5==0) {
            System.out.println("BILANGAN KELIPATAN 3 DAN 5");
        } else if(a%3==0){
            System.out.println("BILANGAN KELIPATAAN 3");
        }else if (a%5==0) {
            System.out.println("BILANGAN KELIPATAN 5");
        }else{
            System.out.println("BUKAN BILANGAN KELIPATAN 3 DAN 5");
        }
        q.close();  
    }
}
