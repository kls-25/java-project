/**
 * Author: Kravchenko Nikolay
 * e-mail: koljan2post@gmail.com
 */
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку 'a': ");
        String a = in.nextLine();
        System.out.print("Введите строку 'b': ");
        String b = in.nextLine();
        in.close();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        }
        else {
            System.out.println("Строки неидентичны");
        }
    }
}
