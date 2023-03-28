//Task_2.
//Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.
//Sample Input:
//4
//1
//2
//3
//5
//2
//Sample Output:
//2
//4
//6
//10

import java.util.Scanner;

public class Task_2{
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = iScanner.nextInt();

        int[] array_numb = new int[n];
        for (int i = 0; i < array_numb.length; i++){
            System.out.printf("Enter number[%d]: ", i);
            array_numb[i] = iScanner.nextInt();
        }

        System.out.print("Enter multiply: ");
        int multiply = iScanner.nextInt();

        System.out.print("Results are: \n");
        for (int i = 0; i < array_numb.length; i++) {
            System.out.printf("%d\n", array_numb[i] * multiply);
        }
        iScanner.close();
    }
}