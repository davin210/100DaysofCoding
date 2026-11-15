import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        String a= q.nextLine();
        String b=q.nextLine();
        String c="";
        System.out.println(a.equals(b));
        // mengecek apakah variabel yang di input sama, harus detail
        System.out.println(a.equalsIgnoreCase(b));
        // mengecek variabel yang diamsukkan apakah sama atau tidak, tidak harus detail
        System.out.println(a.contains(b));
        // mengecek apakah ada konteks yang sama diinput sekalipun dalam kalimat
        System.out.println(c.isEmpty());
        // mengecek apakah variabel kosong atau tidak
        q.close();
    }
}
