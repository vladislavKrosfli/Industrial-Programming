/* Козлов Владислав  ( 1/sqrt(1+x) )
*
Введите х и EPS (-1<x<1).
0,9
0,00001
Значение выражения по формуле: 0.7254762502
Значение выражения по ряду Тейлору: 0,7254814
*
*
Введите х и EPS (-1<x<1).
0,01
0,000001
Значение выражения по формуле: 0.9950371903
Значение выражения по ряду Тейлору: 0,9950375
*/


import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static BigDecimal fact(BigDecimal x) {
        BigDecimal result = BigDecimal.valueOf(1);
        if(x.compareTo(x.remainder(BigDecimal.valueOf(2))) == 0){
            while(x.compareTo(BigDecimal.valueOf(0)) == 0){
             result = result.multiply(x);
             x = x.subtract(BigDecimal.valueOf(2));
            }
        }
        else{
            while(x.compareTo(BigDecimal.valueOf(0)) == 1){
                result = result.multiply(x);
                x = x.subtract(BigDecimal.valueOf(2));
            }
        }
        return result;
    }

    public  static BigDecimal pow(BigDecimal a, BigDecimal b){
        BigDecimal res = a;
        while(b.compareTo(BigDecimal.valueOf(1)) == 1){
            b = b.subtract(BigDecimal.valueOf(1));
            res = res.multiply(a);
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите х и EPS (-1<x<1).");
        BigDecimal x = new BigDecimal(scan.nextDouble());
        BigDecimal eps = new BigDecimal(scan.nextDouble());

        while(x.compareTo(BigDecimal.valueOf(1)) == 1 || x.compareTo(BigDecimal.valueOf(-1)) == -1 || x.compareTo(BigDecimal.valueOf(-1)) == 0 || x.compareTo(BigDecimal.valueOf(1)) == 0){
            System.out.println("Значения x принадлежит промежутку от -1 до 1. Введите х: ");
            x = BigDecimal.valueOf(scan.nextDouble());
        }

        BigDecimal res = new BigDecimal(1);
        BigDecimal temp = new BigDecimal(1);
        temp = temp.add(x);
        MathContext mc = new MathContext(10);
        temp = temp.sqrt(mc);
        res = res.divide(temp, mc);

        System.out.println("Значение выражения по формуле: " + res);

        BigDecimal count = new BigDecimal(1);
        BigDecimal i = new BigDecimal(String.valueOf(1));
        BigDecimal j = new BigDecimal(String.valueOf(1));
        BigDecimal res_1 = new BigDecimal(0);
        BigDecimal count1 = new BigDecimal(1);

        while(eps.compareTo(count1.abs()) == -1){
            res_1 = res_1.add(count1);

            //  count *= Math.pow(-1, j) * Math.pow(x,j) * fact(i) / fact(i+1);

            BigDecimal tmp = new BigDecimal(String.valueOf(fact(i)));
            tmp = tmp.multiply(pow(BigDecimal.valueOf(-1), j));
            tmp = tmp.multiply(pow(x, j));

            BigDecimal i_plus_1 = i.add(BigDecimal.valueOf(1));

            tmp = tmp.divide(fact(i_plus_1));
            count = count.multiply(tmp);

            count1 = count;
            count = new BigDecimal(1);
            i = i.add(BigDecimal.valueOf(2));
            j = j.add(BigDecimal.valueOf(1));
        }

        NumberFormat formatter = new DecimalFormat("#0.0000000");
        System.out.println("Значение выражения по ряду Тейлору: " + formatter.format(res_1));

    }
}
