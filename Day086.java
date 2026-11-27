import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int[] data={12,68,59,45,75};
        System.out.print("masukkan nilai elemen:");
        int cari=q.nextInt();
        boolean jawaban=false;
        for (int i = 0; i < data.length; i++) {
            if (data[i]==cari) {
                System.out.printf("elemen %d ditemukan pada indeks %d",cari,i);
                jawaban =true;
                break;
            }
        }
        if (!jawaban) {
            System.out.printf("elemen %d tidak ada didalam array",cari);
        }
        q.close();
    }
}
