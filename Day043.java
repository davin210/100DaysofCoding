import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        System.out.println();
        int a= q.nextInt();
        int b=q.nextInt();
       while (a<=15) {
        System.out.println(a+=3);
        System.out.println(a+=5);
       }
       if (b<=20) {
        System.out.println(a+3);
       }else if (b<=20){
        System.out.println(a+5);
       }else if (b<=20) {
        System.out.println(a+3);
       }else if (b<=20){
        System.out.println(a+5);
       }else{
        System.out.println("angka terlalu besar");
       }
        q.close();  
    }
}
