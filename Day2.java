public class App {
    public static void main(String[] args) throws Exception {
        String Nama = "DAVIN ISTIQORI";
        String TTL = "Salupangkan,23,Mei,2008";
        String Alamat = "Mamuju Tengah";
        int Umur = 18;

        System.out.println("Nama :"+Nama);
        System.out.println("TTL :"+TTL);
        System.out.println("Alamat :"+Alamat);
        System.out.println("Umur :"+Umur);

        System.out.print("Nama:"+Nama);
        System.out.print("TTL:"+TTL);
        System.out.print("Alamat:"+Alamat);
        System.out.print("Umur:"+Umur);

        System.out.println( );

        System.out.printf("Nama:%s\n",Nama);
        System.out.printf("TTL:%s\n",TTL);
        System.out.printf("Alamat:%s\n",Alamat);
        System.out.printf("Umur:%d\n",Umur);
        /**
         * %s untuk string
         * %d untuk int
         * %f untuk desimal
         * %.0f-%.3f
         * %n atau \n untuk line baru
        */
    }
}
