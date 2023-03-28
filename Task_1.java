//Task_1.
//Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
//Sample Input:
//8
//11
//Sample Output:
//512
//1331

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){

        int[] nums_array = new int[1000];
        for (int i = 0; i < nums_array.length; i++){
            nums_array[i] = i * i * i;
        }

        Scanner iScanner = new Scanner(System.in);

        System.out.print("first_num: ");
        int first_num = iScanner.nextInt();
        System.out.print("second_num: ");
        int second_num = iScanner.nextInt();

        System.out.printf("first cube is %d\n", nums_array[first_num]);
        System.out.printf("second cube is %d\n", nums_array[second_num]);
        iScanner.close();
    }
}