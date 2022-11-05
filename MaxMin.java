
package searching;
//minmax

public class MaxMin {
    
     public static int getMax(int[] param) {
        int value = param[0];
        for (int i = 0; i < param.length; i++) {
            if (param[i] > value) {
                value = param[i];
            }
        }
        return value;
    }

    public static int getMin(int[] param) {
        int value = param[0];
        for (int i = 0; i < param.length; i++) {
            if (param[i] < value) {
                value = param[i];
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {17, 43, 85, 96, 76, 90};

        int max = getMax(arr);
        System.out.println("Bilangan Terbesar Adalah : " + max);

        int min = getMin(arr);
        System.out.println("Bilangan Terkecil Adalah : " + min);

    }
}
