/* Козлов Владислав , задание 12 , ln((1+x)/(1-x))

 0,3
 4
 Результат выполнения функции sh(x): 0.3045202934471426
 По ряду Тейлора sh(x): 0.30452025

 0,08
 2
 Результат выполнения функции sh(x): 0.08008536064416139
 По ряду Тейлора sh(x): 0.08008533333333334

 6
 6
 Ошибка! Число х из промежутка от -1 до 1.
 0,83
 6
 Результат выполнения функции sh(x): 0.9286347269713235
 По ряду Тейлора sh(x): 0.9286347237307401
*/

import java.util.Scanner;

public class Main2 {

    public static double fact(int x){
        double result = 1;
        while(x != 0){
            result*=x;
            x--;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите х и k. Где k - целое, a х из промежутка от -1 до 1.");

        double x = scan.nextDouble();
        double k = scan.nextDouble();

        while (x > 1 || x < -1){
            System.out.println("Ошибка! Число х из промежутка от -1 до 1.");
            x = scan.nextDouble();
        }

        System.out.println("Результат выполнения функции sh(x): " + Math.sinh(x));

        double count = 1;
        double res = 0;
        int i = 1;

        while(count > Math.pow(10, -k)) {

            count = Math.pow(x,i)/fact(i);
            res += count;

             i+=2;
        }

        System.out.println("По ряду Тейлора sh(x): " + res);
    }
}
