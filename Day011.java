import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner d  = new Scanner(System.in);
      // scanner adalah cara memasukkan data diluar codingan 
        String nama;
      // disini penentuan tipe datanya

        System.out.print("nama:");
      // disini tempat dimana kita memasukkan datanya
        nama =d.nextLine();
      // nama =d.nextline untuk  menyimpan data yang telah dinput
        
        System.out.println("salam kenal nama saya "+nama);
      // disini outputnya
        d.close();
      // fungsi d.close(); untuk menhilangkan garis kuning yang ada dibawah codingan

    }
}
