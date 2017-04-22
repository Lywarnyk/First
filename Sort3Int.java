/*
Сортировка трех чисел
        Ввести с клавиатуры три числа, и вывести их в порядке убывания.
        Выведенные числа должны быть разделены пробелом.


        Требования:
        1. Программа должна считывать числа c клавиатуры.
        2. Программа должна выводить числа на экран.
        3. Выведенные числа должны быть разделены пробелом.
        4. Программа должна выводить числа в порядке убывания.
*/
import java.util.Scanner;


public class Sort3Int {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int  x[]= {sc.nextInt(),sc.nextInt(),sc.nextInt()};

        int iteration = 0;
        int currInd;
        for (int i=1; i < 3; i++){

            currInd = i;
            iteration++;
            while (currInd > 0 && x[currInd] > x[currInd-1]){
                swap(x, currInd, currInd-1);
                iteration++;
                currInd = currInd -1;
            }

        }
        for (int i = 0; i <3 ; i++) {
            System.out.print(x[i]+" ");
        }
    }
    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }
}
