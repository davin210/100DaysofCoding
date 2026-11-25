public class day85 {
    public static void main(String[] args) {
        int[] data ={69,2,34,67,54};
        int min=data[0];

        for (int i = 0; i < data.length; i++) {
            if (data[i]<min) {
                min=data[i];
            }
        }
        System.out.println("nilai minimal didalam array adalah:"+min);
    }
}
