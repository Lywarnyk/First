/**
 Цель установлена!
 Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
 Вывести на экран номер координатной четверти, в которой находится данная точка.
 Подсказка:
 Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
 для первой четверти a>0 и b>0;
 для второй четверти a<0 и b>0;
 для третьей четверти a<0 и b<0;
 для четвертой четверти a>0 и b<0.

 Пример для чисел 4 6:
 1

 Пример для чисел -6 -6:
 3
 */
import java.util.*;



public class Coords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>0&&y>0){
            print(1);
        }
        else if(x<0&&y>0){
            print(2);
        }
        else if(x<0&&y<0){
            print(3);
        }
        else if(x>0&&y<0){
            print(4);
        }
    }
    public static void print(int x){
        System.out.println(x);
    }
}
