/* Козлов Владислав, 7 группа

Написать программу для консольного процесса, который состоит из двух потоков: Main и Sort.

Поток Main должен выполнить следующие действия:
создать массив целых чисел, размерность вводится пользователем с клавиатуры, элементы которого задаются программно числами от 1 до размерности;
вывести размерность и элементы исходного массива на консоль;
запросить у пользователя порядок сортировки массива (возрастание или убывание);
запустить поток Sort;
вывести на консоль элементы отсортированного массива после завершения работы потока Sort.

Поток Sort должен выполнить следующие действия:
отсортировать элементы введенного массива в соответствии с заданным порядком (использовать Comparator).


!!! добавил поток MinMaxThread который находит минимальный и максимальный элементы в массиве

--------------------------------------------------------------------------------------------------

Введите размерность массива:
6
Введите 6 элементов массива:
8 2 7 4 0 1
Выберите вид сортировки:
1)по возрастанию
2)по убыванию
1
[0, 1, 2, 4, 7, 8]
Минимальный элемент в массиве:		0
Максимальный элемент в массиве :	8
*/


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите размерность массива:");
        int size = scan.nextInt();

        Integer arr[] = new Integer[size];

        System.out.println("Введите " + size +  " элементов массива:");
        for(int i = 0; i < size; ++i){
            arr[i] = scan.nextInt();
        }

        System.out.println("Выберите вид сортировки:\n1)по возрастанию\n2)по убыванию");

        int value = scan.nextInt();
        SortThread sr = new SortThread();
        sr.setArr(arr);

        switch (value){
            case 1:
                sr.setSorting("increase");
                sr.run();
                break;

            case 2:
                sr.setSorting("decrease");
                sr.run();
                break;
        }
        System.out.println(Arrays.toString(arr));

        MinMaxThread mmt = new MinMaxThread();
        mmt.setArr(arr);
        mmt.run();
        System.out.println("Минимальный элемент в массиве:\t\t" + mmt.getMin() + "\nМаксимальный элемент в массиве :\t" + mmt.getMax());
    }
}
