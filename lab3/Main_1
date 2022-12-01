/* Козлов Владислав
*
* 5. Среди слов, состоящих только из цифр, найти слово, содержащее максимальное число нулей.
* Если таких слов больше одного, найти предпоследнее из них.
*
Введите строку
123 /]/]/..//. 213 20031 2003 2/.
Число с наибольшим количеством нулей: 2003, его номер в массиве: 3
*/

import java.util.Scanner;

public class Main{
    private static int count_zero(String s) {
        int temp = 0;
        try {
            int Value = Integer.parseInt(s);
            while(Value != 0){
                int num = Value % 10;
                Value = (Value - num)/10;
                if(num == 0){
                    temp++;
                }
            }
        }
        catch (NumberFormatException e){}
        return temp;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку");
        String Str;
        Str = scan.nextLine();
        String str[] = new String[1000];

        int size = 0;

        String[] words = Str.split("[^a-zA-Z0-9]+");

        for (String word : words) {
            str[size] = word;
            size++;
        }

        int temp = 0, index = 0;
        for(int i = 0; i < size; i++){
            int count = count_zero(str[i]);
            if(temp <= count){
                temp = count;
                index = i;
            }
        }
        if(temp != 0)
            System.out.println("Число с наибольшим количеством нулей: " + str[index] + ", его номер в массиве: " + index);
        else
            System.out.println("Такого числа нет");
    }
}
