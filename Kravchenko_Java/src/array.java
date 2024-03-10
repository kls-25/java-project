/**
 * Author: Kravchenko Nikolay
 * e-mail: koljan2post@gmail.com
 */
public class array {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : a) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
