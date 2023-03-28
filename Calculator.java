//Task_3
//Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Result is: "+result);
    }

    public static int getInt(){
        System.out.println("Enter number:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Entered number is incorrect. Please try again.");
            scanner.next();//recursion
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Enter operation:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Your enter is incorrect. Please try again.");
            scanner.next();//recursion
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Incorrect operation. Please try again.");
                result = calc(num1, num2, getOperation());//recursion
        }
        return result;
    }
}