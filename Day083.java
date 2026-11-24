import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int[] data =new int[4];
        data[0]=23;
        data[1]=89;
        data[2]=58;
        data[3]=12;
        int hasil=0;
        for (int i = 0; i < data.length; i++) {
            hasil+=data[i];
        }
        System.out.println("Hasil penjulahan: "+hasil);
        q.close();
    }
}
