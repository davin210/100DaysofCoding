import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int[] data={1,23,45,76,4,0};
        System.out.println("sebelum");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        data[0]=34;
        System.out.println("sesudah");

        for (int i = 0; i < data.length; i++) {
            System.out.println("sesudah");
            System.out.print(data[i]);
        }
        q.close();
    }
}
