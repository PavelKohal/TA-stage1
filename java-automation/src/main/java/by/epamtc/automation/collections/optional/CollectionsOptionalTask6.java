package by.epamtc.automation.collections.optional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import  java.util.Comparator;

public class CollectionsOptionalTask6 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("source_task_6"));
        List<String> stringList = new ArrayList<>();

        while(sc.hasNextLine()) {
            stringList.add(sc.nextLine());
        }
        sc.close();

        System.out.println("Исходный текст: ");
        for (String str: stringList) {
            System.out.println(str);
        }

        Collections.sort(stringList, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        System.out.println("Отсортированный текст: ");
        for (String str: stringList) {
            System.out.println(str);
        }
    }
}
