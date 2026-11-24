import java.util.Arrays;
import java.util.Scanner;

public class day84 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int[] data ={69,2,34,67,54};
        int max=data[0];

        for (int i = 0; i < data.length; i++) {
            if (data[i]>max) {
                max=data[i];
            }
        }
        int maksimal=Arrays.stream(data).max().orElse(0);
        System.out.println("nilai maksimal didalam array adalah:"+max);
        System.out.println("nilai maksimal didalam array adalah:"+maksimal);
        q.close();
    }
}
