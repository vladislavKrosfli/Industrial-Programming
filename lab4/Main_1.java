/* Козлов Владислав
 *
 * 5.Задан текстовый файл input.txt.
 * Требуется определить строки этого файла,
 * содержащие максимальную по длине подстроку-палиндром.
 * Если таких строк несколько, найти первые 10.
 * Результат вывести на консоль в форме, удобной для чтения.
 *
1221 3443 sbcddc 7667 4334 asd12241 1221 1331 3443 1111 23443 0110

1) подстрока палиндором: 1221
2) подстрока палиндором: 3443
3) подстрока палиндором: cddc
4) подстрока палиндором: 7667
5) подстрока палиндором: 4334
6) подстрока палиндором: 1221
7) подстрока палиндором: 1331
8) подстрока палиндором: 3443
9) подстрока палиндором: 1111
10) подстрока палиндором: 3443
    (дальше 10 не идёт)
*
* */

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    static String longestPalSubstr(String str) {
        int n = str.length();
        int maxLength = 1, start = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;

                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;

                if (flag!=0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        String res = "";

        for (int i = start; i < start + maxLength; ++i)
            res += str.charAt(i);

        if(res.length() == 1){
            return "-1";
        }

        return res;
    }

    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("input.txt");
        Scanner scan = new Scanner(in);

        Path path = Paths.get("input.txt");
        long lineCount = Files.lines(path).count(); //количество строк
        long size = lineCount;

        String[] str = new String[(int) size];
        int i = 0;
        int max_size = 0;
        int str_size = 0;

        System.out.println("Массив из файла: ");
        while(size != 0) {
            String tempStr = scan.nextLine();
            System.out.print(tempStr + " ");

            String tempStrNew = longestPalSubstr(tempStr);

            if(longestPalSubstr(tempStr) != "-1"){
                if(tempStrNew.length() >= max_size){
                    max_size = tempStrNew.length();
                }
                str[i] = tempStrNew;
                i++;
                str_size++;
            }
            size--;
        }

        int block = 0;

        System.out.println("\n");
        for(i = 0; i < str_size; i++){
            if(block == 10){
                break;
            }

            if(max_size == str[i].length()) {
                System.out.println(block + 1 + ") подстрока палиндором: " + str[i]);
                block++;
            }
        }

    }
}
