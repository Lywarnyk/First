/**
 * Created by lywar on 22.04.2017.
 */
import java.util.Scanner;

public class LessInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        int y  = sc.nextInt();
        if (x<y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }
}
