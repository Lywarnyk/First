/**
 * Created by lywar on 19.04.2017.
 */
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt(); //10
        b = sc.nextInt(); //5
        c = sc.nextInt(); //6
        if (a <(b+c) && b < (a+c) && c < (a+b)){
            System.out.println("Треугольник существует");

        }
        else {
            System.out.println("Треугольник не существует");
        }
    }
}
