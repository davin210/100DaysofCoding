import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        System.out.print("Suhu ruangan:");
        double suhu =q.nextDouble();
        if (suhu<=25) {
            System.out.println("SUHU RUNGAN NORMAL");
        }else if (suhu<=20) {
            System.out.println("SUHU RUANGAN DINGIN");
        }else{
            System.out.println("SUHU RUANGAN PANAS");
        }
        System.out.println(suhu+" °C");
        q.close();
    }
}
