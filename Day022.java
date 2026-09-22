public class day22 {
    public static void main(String[] args) {
        int A = 34;
        int B = 56;

        System.out.println("sebelum ditukar: A="+A+"\tB="+B);
        
         int da = A;
        A = B;
        B = da;

        System.out.println("sesudah ditukar: A="+A+"\tB="+B);
    }
}
