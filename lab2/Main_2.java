/* Козлов Владислав

5. Среди столбцов заданной  матрицы, содержащих только такие элементы,
которые по модулю не больше n, найти столбец с минимальным произведением элементов.

Введите размерность вектора n*m.
3 8
8	10	12	6	6	4	1	10
1	4	12	6	2	9	12	1
2	10	6	7	0	3	3	3
Введите число k:
7
Ответ на 5 задачу: 0


Введите размерность вектора n*m.
4 4
10	6	5	7
5	11	4	8
11	11	6	7
6	1	2	10
Введите число k:
11
Ответ на 5 задачу: 240
*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите размерность вектора n*m.");

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] Matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix[i][j] = rand.nextInt(15);
                System.out.print(Matrix[i][j] + "\t");
            }
            System.out.println();
        }

//------------------------------------------------------------------------

        System.out.println("Введите число k: ");
        int k = scan.nextInt();

        int tmp_sum = 0;
        for (int j = 0; j < m; j++) {
            int count = 0;
            int sum = 1;
            for (int i = 0; i < n; i++) {
                if (Math.abs(Matrix[i][j]) <= k) {
                    count++;
                    sum *= Matrix[i][j];
                }
                if (count == n) {
                    if (sum < tmp_sum || tmp_sum == 0) {
                        tmp_sum = sum;
                    }
                }
            }
        }

        System.out.println("Ответ: " + tmp_sum);
    }
}
