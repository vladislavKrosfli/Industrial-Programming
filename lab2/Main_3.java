/* Козлов Владислав

33. Добиться,  чтобы наибольший элемент
(один  из них) оказался в верхнем левом углу.
Вывести на экран полученную матрицу.

Введите размерность матрицы.
4 6
Matrix:
60	1	6	51	69	86
33	97	5	11	6	30	
64	9	35	50	29	89
86	76	30	45	79	94

new Matrix:
97	60	1	6	51	69
33	60	97	5	11	6
64	9	35	50	29	89
86	76	30	45	79	94
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> Matrix = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.println("Введите размерность матрицы.");
        n = scan.nextInt();
        m = scan.nextInt();

        Random number = new Random();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                temp.add(number.nextInt(100));
            }
            Matrix.add(temp);
        }

        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Matrix.get(i).get(j) + "\t");
            }
            System.out.print('\n');
        }

        int maxEl = 0;
        int maxI = 0, maxJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                if (maxEl < Math.abs(Matrix.get(i).get(j))) {
                    maxEl = Matrix.get(i).get(j);
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        int temp = Matrix.get(0).get(0);
        Matrix.get(0).add(0, maxEl);
        Matrix.get(maxI).add(maxJ, temp);


        System.out.println("\nНовая матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Matrix.get(i).get(j) + "\t");
            }
            System.out.print('\n');
        }
    }
}


