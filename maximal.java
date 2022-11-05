
package searching;
//max

public class maximal {
    public static void main(String[] args) {
        
                int[] arr = new int[] {17, 43, 85, 96, 76, 90};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >  max) {
                max = arr[i];
            }
        }
        System.out.println("Bilangan Terbesar Adalah : " + max);
    }
}
