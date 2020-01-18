package by.epamtc.automation.collections.optional;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CollectionsOptionalTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        String sourceNum = sc.nextLine();
        char[] array = sourceNum.toCharArray();

        Deque<String> stack =  new ArrayDeque<String>();
        for(char c: array) {
            stack.push(String.valueOf(c));
        }
        String resultNum = "";
        while(!stack.isEmpty()) {
            resultNum += stack.pop();
        }
        System.out.println("Результат: " + resultNum);
    }
}
