public class day21 {
    public static void main(String[] args) {
        String noPendaftaran = "29";
        String noPendaftaran975 = "true";
        byte no = Byte.parseByte(noPendaftaran);
        short da = Short.parseShort(noPendaftaran);
        int noPed = Integer.parseInt(noPendaftaran);
        long dd = Long.parseLong(noPendaftaran);
        float noped2 = Float.parseFloat(noPendaftaran);
        double noped3 = Double.parseDouble(noPendaftaran);
        boolean noped4 = Boolean.parseBoolean(noPendaftaran975);
        char noped5 = noPendaftaran.charAt(0);
        // mengeubah type data non primitif ketype data primitif
        System.out.println("byet\t:"+no);
        System.out.println("short\t:"+da);
        System.out.println("int\t:"+noPed);
        System.out.println("long\t:"+dd);
        System.out.println("float\t:"+noped2);
        System.out.println("double\t:"+noped3);
        System.out.println("boolean\t:"+noped4);
        System.out.println("char\t:"+noped5);
    }
}
