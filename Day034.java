import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("=== ATURAN UNTUK MASUK BIANGLALA ===");
        System.out.print("Masukkan tinggi lu:");
        int a =d.nextInt(); 
        if (a>=145) {
            System.out.println("lu boleh masuk");
        } else if(a>=200){
            System.out.println("tinggi banget lu bang");
        }else{
            System.out.println("lu gak boleh masuk");
        }
        d.close();
    }
}
