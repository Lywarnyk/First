/**
 * Created by lywar on 22.04.2017.
 */
import java.util.Scanner;

public class Pare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a==b&&b==c ){
            System.out.println(a+" "+b+" "+c);
        }
        else if (a==b){
            System.out.println(a+" "+b);
        }
        else if(b==c){
            System.out.println(b+" "+c);
        }
        else if(a==c){
            System.out.println(a+" "+c);
        }

    }
}
