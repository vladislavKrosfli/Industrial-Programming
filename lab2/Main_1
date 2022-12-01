/* Козлов Владислав 19 задача

19.Пусть m(А, i) означает номер столбца матрицы A, в котором находится
последний в строке минимум i-й строки. Проверить,  что для заданной матрицы
А выполняются неравенства m(A,1)  m(A,2)  ...  m(A,m).

Введите размерность вектора n*m.
4 7
73	11	29	51	19	62	76
7	89	83	63	89	58	33
25	99	6	88	44	57	17
29	33	97	15	74	88	56

7 11 6 15 19 57 17
false

Введите размерность вектора n*m.
10 3
5	48	13
29	44	43
37	27	48
14	18	46
3	24	19
26	13	5
25	4	37
17	44	39
28	46	35
1	45	25

1 4 5
true

*/
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите размерность вектора n*m.");

        int n = scan.nextInt();
        int m = scan.nextInt();

        Vector<Integer> arr = new Vector<>();

        Vector<Vector<Integer>> vect = new Vector<Vector<Integer>>();
        Random number = new Random();
        for(int i = 0; i < n; i++) {
            Vector<Integer> temp = new Vector<Integer>();
            for (int j = 0; j < m; j++) {
                temp.add(number.nextInt(50) + 1);
            }
            vect.add(temp);
        }

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                System.out.print(vect.get(i).get(j) + "\t");
            }
            System.out.print('\n');
        }

//------------------------------------------------------------------------

        int size = 0;
        int k = 0;
        int tmp = 0, ind_min = 0;
        int temp = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (tmp > vect.get(i).get(j) || tmp == 0){
                    tmp = vect.get(i).get(j);
                    ind_min = tmp;
                }
            }
            arr.addElement(ind_min);
            k++;
            size++;
            tmp = 0;
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (i == size - 1 || arr.get(i) <= arr.get(i+1)){
                count++;
            }
        }

        for(int i = 0; i < k; i++){
            System.out.print(arr.get(i) + " ");
        }

        if (count == size) {
            System.out.println("\n" + "true");
        }
        else {
            System.out.println("\n" + "false");
        }
    }
}
