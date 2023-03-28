//Task_4. *
//+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class Task_4{
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String first = iScanner.nextLine();

        System.out.print("Enter second number: ");
        String second = iScanner.nextLine();

        System.out.print("Enter summa: ");
        int summa = iScanner.nextInt();

        int flag_first = -1; //find char ? and position
        int flag_second = -1;

        if (first.indexOf('?') != -1){
            flag_first = first.indexOf('?');//where is ?
        }
        if (second.indexOf('?') != -1){
            flag_second = second.indexOf('?');
        }

        boolean find_ok = false;
        char ch_i = ' '; //current digit since 0 until 9
        char ch_j = ' ';
        int temp_first = 0; //current number
        int temp_second = 0;
        char[] chars_first = first.toCharArray(); //string of number to array of chars
        char[] chars_second = second.toCharArray();
        if (flag_first != -1 & flag_second != -1){
            for (int i = 0; i < 9; i++) {
                ch_i = Character.forDigit(i, 10);
                chars_first[flag_first] = ch_i;
                temp_first = Integer.parseInt(String.valueOf(chars_first));
                for (int j = 0; j < 9; j++) {
                    ch_j = Character.forDigit(j, 10);
                    chars_second[flag_second] = ch_j;
                    temp_second = Integer.parseInt(String.valueOf(chars_second));
                    if((temp_first + temp_second) == summa){
                        System.out.printf("%d + %d = %d\n", temp_first, temp_second, summa);
                        find_ok = true;
                        break;
                    }
                }
            }
        } else if (flag_first != -1) {
            for (int i = 0; i < 9; i++) {
                ch_i = Character.forDigit(i, 10);
                chars_first[flag_first] = ch_i;
                temp_first = Integer.parseInt(String.valueOf(chars_first));
                if((temp_first + Integer.parseInt(second)) == summa){
                    System.out.printf("%d + %s = %d\n", temp_first, second, summa);
                    find_ok = true;
                    break;
                }
            }
        }else {
            for (int j = 0; j < 9; j++) {
                ch_j = Character.forDigit(j, 10);
                chars_second[flag_second] = ch_j;
                temp_second = Integer.parseInt(String.valueOf(chars_second));
                if((Integer.parseInt(first) + temp_second) == summa){
                    System.out.printf("%s + %d = %d\n", first, temp_second, summa);
                    find_ok = true;
                    break;
                }
            }
        }

        if(!find_ok){
            System.out.println("Any solutions not found");
        }

        iScanner.close();
    }
}