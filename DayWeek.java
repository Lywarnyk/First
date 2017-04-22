/**
 * Created by lywar on 12.04.2017.
 */
import java.util.Scanner;
public class DayWeek {


/*
День недели
*/
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            String week[] = {"понедельник","вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
            if (x<1 || x>7){
                System.out.println("такого дня недели не существует");
            }
            else{
                System.out.println(week[x-1]);
            }

        }
    }

