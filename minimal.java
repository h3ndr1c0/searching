
package searching;
//min

public class minimal {
    
     public static void main(String[] args) {
        
                int[] arr = new int[] {17, 43, 85, 96, 76, 90};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <  min) {
                min = arr[i];
            }
        }
        System.out.println("Bilangan Terkecil Adalah : " + min);

    }
}
