import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        System.out.println("kelas");
        int a=q.nextInt();
        String hasil = (a==11)?"sebelas":a==12?"duabelas":"err";
        System.out.println(hasil);
        q.close();
    }
}

