package by.epamtc.automation.collections.optional;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsOptionalTask1 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("source_task_1"));
        List<String> stringList = new ArrayList<>();

        while(sc.hasNextLine()) {
            stringList.add(sc.nextLine());
        }
        sc.close();

        PrintWriter pw = new PrintWriter(new File("result_task_1"));
        for(int i = stringList.size() - 1; i >= 0; i--) {
            pw.println(stringList.get(i));
        }
        pw.close();
    }
}
