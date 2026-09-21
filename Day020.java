public class day20 {
    public static void main(String[] args) {
        byte BYTE = 127;
        short SHORT = 32767;
        int INT = 2147483647;
        long LONG = 922337203;

        double DOUBLE = 75.5;
        float FLOAT = 3.14159f;

        char inisial = 'D';
        boolean lampuMati = true;
        String a =String.valueOf(BYTE);
        String b =String.valueOf(SHORT);
        String p =String.valueOf(INT);
        String c =String.valueOf(LONG);
        String d =String.valueOf(DOUBLE);
        String e =String.valueOf(FLOAT);
        String f =String.valueOf(inisial);
        String g =String.valueOf(lampuMati);
        // mengubah data primitif ketype data non primitif
        System.out.println("byte\t:"+a);
        System.out.println("short\t:"+b);
        System.out.println("int\t:"+p);
        System.out.println("long\t:"+c);
        System.out.println("float\t:"+e);
        System.out.println("double\t:"+d);
        System.out.println("char\t:"+f);
        System.out.println("boolean\t:"+g);
    }
}
