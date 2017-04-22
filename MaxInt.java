/**
 * Created by lywar on 22.04.2017.
 */

import java.util.Scanner;

public class MaxInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = {0,0,0,0};
        for (int i = 0; i <4 ; i++) {
            x[i] = sc.nextInt();
        }
        int max = x[0];
        for (int i = 1; i <4; i++) {

            if (x[i]>max){
                max = x[i];
            }
        }
        System.out.println(max);
    }
}
