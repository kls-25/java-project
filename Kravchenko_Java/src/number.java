/**
 * Author: Kravchenko Nikolay
 * e-mail: koljan2post@gmail.com
 */
import java.util.Scanner;

import static java.lang.Integer.sum;

public class number {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Введите число 'a': ");
        int a = in.nextInt();
        System.out.print("Введите число 'b': ");
        int b = in.nextInt();
        in.close();
        if (a > b) {
            System.out.println("a > b");
        }
        else if (a < b) {
            System.out.println("a < b");
        }
        else {
            System.out.println("a = b");
        }
        System.out.println("a + b: " + sum(a, b));
        int FirstNumber = a - b; {
            System.out.println("a - b: " + FirstNumber);
        }
        double SecondNumber = (double) a / b; {
            System.out.println("a / b: " + SecondNumber);
        }
        int ThirdNumber = a * b; {
            System.out.println("a * b: " + ThirdNumber);
        }
    }
}
