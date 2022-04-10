package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*3. Дан символ C. Вывести два символа, первый из которых предшествует символу
    C в кодовой таблице, а второй следует за символом C.
     */
    public static void task3() {
        char sim = 'C';
        System.out.println((char)(sim-1));
        System.out.println((char)(sim+1));
    }

    /*26. Дано целое число N (> 0) и строка S. Преобразовать строку S в строку
    длины N следующим образом: если длина строки S больше N, то отбросить первые
    символы, если длина строки S меньше N, то в ее начало добавить символы «.» (точка).
     */
    public static void task26() {
        String s = new String();
        String s1 = new String();
        int n,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");

        s = sc.nextLine();
        n = sc.nextInt();
        r = s.length()-n;
        if (r<0 && r!= 0){
            for (int i = 0; i < -r; i++) {
                s1+='.';
            }
            s1+=s;
            System.out.println("'  "+s1+"  '");
        } else if (r!=0) {
            s1 = s.substring(r);
            System.out.println("'  "+s1+"  '");

        }else{
            System.out.println("'  "+s+"  '");
        }

    }


    /*Дана строка, состоящая из слов кириллицей, набранных заглавными буквами
    и разделенных пробелами (одним или несколькими). Преобразовать каждое слово
     в строке, заменив в нем все предыдущие вхождения его последней буквы на символ
      «.» (точка). Например, слово «МИНИМУМ» надо преобразовать в «.ИНИ.УМ».
      Количество пробелов между словами не изменять.
     */
    public static String removeLastChar(String s) {
        return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
    }

    public static void task49() {
        char prob = ' ';
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words;
        words = s.split(" ");
        String[] wordsNew = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if ( words[i].length()>0){
                wordsNew[i] = removeLastChar(words[i].replace(words[i].charAt(words[i].length()-1), '.'));
                wordsNew[i]+=words[i].charAt(words[i].length()-1) ;
                System.out.print(wordsNew[i]);
            }
            System.out.print(" ");
        }
    }



    public static void main(String[] args) {
        task3();
        task26();
        task49();
    }
}
