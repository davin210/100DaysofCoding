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
        // perintah println untuk menampilkan teks yang dipanggil hanya dalam 1 baris yang akan otomatis membuat baris baru setelahnya
        System.out.println("\n");
        
        System.out.print("Nama:"+Nama);
        System.out.print("TTL:"+TTL);
        System.out.print("Alamat:"+Alamat);
        System.out.print("Umur:"+Umur);
        /** perintah print untuk menampilkan teks kelayar tanpa membuat baris baru setelah menampilkan teks jadi hasil outputnya hanya
         * 1 baris saja
        */

        System.out.println("\n");

        System.out.printf("Nama:%s\n",Nama);
        System.out.printf("TTL:%s\n",TTL);
        System.out.printf("Alamat:%s\n",Alamat);
        System.out.printf("Umur:%d\n",Umur);
        /**perintah printf memiliki kesamaan dengan println namun printf harus memasukakkan kode terlebih dahulu dan tidak harus ada tanda + untuk memanggil variabel
         * dan juga printf bisa dibilang lebih rapi dibandingkan println
         * %s untuk string
         * %d untuk int
         * %f untuk desimal
         * %n atau \n untuk line baru
        */
    }
}
