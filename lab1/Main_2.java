// Козлов Владислав
// Задача: 1/sqrt(1+x)

// 0,4
// 4
// Значение выражения по формуле: 0.8451542619249623
// Значение выражения по ряду Тейлору: 0.84518949820547

// -0,7
// 6
// Значение выражения по формуле: 1.8257418583505536
// Значение выражения по ряду Тейлору: 1.825739416000482

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static double fact(int x) {
        double result = 1;
        if (x % 2 == 0) {
            while (x != 0) {
                result *= x;
                x -= 2;
            }
        }
        else {
            while (x != 1) {
                result *= x;
                x -= 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите х и k (-1<x<1, k - целое).");
        double x = scan.nextDouble();
        float k = scan.nextFloat();

        while(x > 1 || x < -1){
            System.out.println("Значения x принадлежит промежутку от -1 до 1. Введите х: ");
            x = scan.nextFloat();
        }
        double res = 1 / Math.sqrt(1 + x);
        System.out.println("Значение выражения по формуле: " + res);

        double eps = Math.pow(10, -k);
        double count = 1;
        int i = 1, j = 1;
        res = 0;
        double count1 = 1;
        while(Math.abs(count1) > eps){
            res += count1;
            count *= Math.pow(-1, j) * Math.pow(x,j) * fact(i) / fact(i+1);
            count1 = count;
            count = 1;
            i += 2;
            j++;
        }
        System.out.println("Значение выражения по ряду Тейлору: " + res);
    }
}
