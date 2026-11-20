import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int[] data =new int[4];
        data[0]=23;
        data[1]=89;
        data[2]=58;
        data[3]=12;
        
        int no=q.nextInt();
        System.out.println(data[no]);
        q.close();
    }
}
