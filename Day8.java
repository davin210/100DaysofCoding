public class day8 {
    // disini pendeklarasian kelas atau bisa dicontohkan sebagai rumah
    public static void main(String[] args) {
        // dan disini pendeklarasian seperti ruangan yang ada didalam rumah jadi ini bagian kecil dari class
        int umur;
        // yang pertama pedeklarasian variabel(tentukan variabel apa yang akan diinput)

        umur = 18;
        // yang kedua inisialisasi variabel (pemberian nama kepada variabel)

        System.out.printf("umur\t:%d\n",umur);
        // dibagian ini untuk menampilkan variabel yang telah kita masukkan tadi

        umur = 23;
        /**untuk update variabel kita hanya perlu memanggil nama variabel
         * lalu memasukkan data yeng terbaru
         */
        System.out.printf("umur\t:%d",umur);
    }
}
