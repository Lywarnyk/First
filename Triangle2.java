/**
 * Created by lywar on 22.04.2017.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Triangle2 {





        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            int s = a + b;
            int d = b + c;
            int f = c + a;
            if (s > c && d > a && f > b )
                System.out.println("Треугольник существует.");

            else
                System.out.println("Треугольник не существует.");
        }
    }

