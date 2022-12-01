/*     1) Задача "контакты"
        а) разработать класс Контакт, определяющий запись в электронной книге мобильного
        телефона и содержащий по меньшей мере следующие поля:
        - *Наименование (имя человека или организации)
        - *Номер телефона мобильного
        - Номер телефона рабочего
        - Номер телефона (домашнего)
        - Адрес электронной почты
        - Адрес веб-страницы
        - Адрес

        Обязательными является поля помеченные *, остальные поля могут быть пустыми

        б) класс Контакт должен реализовать:
        -интерфейс Comparable и Comparator с возможностью выбора одного из полей для сравнения
        -интерфейс Iterator - индексатор по всем полям объекта Контакт
        -метод для сохранения значений всех полей в строке текста (переопределить toString())
        -конструктор или метод для инициализации объекта из строки текста

        в) Для тестирования класса Контакт, создать консольное приложение позволяющее
        создать небольшой массив контактов и напечатать отсортированными по
        выбранному полю.

*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

//*** Входной файл состоит из email number name, они могут идти в любом порядке

/*
* {name='dima', number='+375291233215', email='pp@gmail.com'}
{name='andrey', number='+375331234567', email='frik@bsu.by'}
{name='vasyaPupkin', number='+375254545455', email='aboba@mail.ru'}

Сортировка по имени:
{name='andrey', number='+375331234567', email='frik@bsu.by'}
{name='dima', number='+375291233215', email='pp@gmail.com'}
{name='vasyaPupkin', number='+375254545455', email='aboba@mail.ru'}

Сортировка по email:
{name='andrey', number='+375331234567', email='frik@bsu.by'}
{name='dima', number='+375291233215', email='pp@gmail.com'}
{name='vasyaPupkin', number='+375254545455', email='aboba@mail.ru'}

Process finished with exit code 0

* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        ArrayList<contacts> list = new ArrayList<>();

        int size = 0;
        String inputStr;

        while ((inputStr = reader.readLine()) != null) {
            contacts f = new contacts(inputStr);
            list.add(f);
            size++;
        }

        System.out.println();
        for(int i = 0; i < size; i++){
            System.out.println(list.get(i));
        }

        Comparator compN = new compareName();
        list.sort(compN);
        System.out.println();
        System.out.println("Сортировка по имени: ");
        for(contacts c:list){
            System.out.println(c);
        }

        Comparator compE = new compareEmail();
        list.sort(compE);
        System.out.println();
        System.out.println("Сортировка по email: ");
        for(contacts c:list){
            System.out.println(c);
        }
    }
}
