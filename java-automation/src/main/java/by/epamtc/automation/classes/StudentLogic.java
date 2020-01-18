package by.epamtc.automation.classes;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentLogic {

    public void printStudentListGivenFaculty(Student[] student) {

        System.out.println("Введите аббревиатуру требуемого факультета");
        System.out.print("(EF - экономический, MF - механический, TF - технологический): ");
        Scanner sc = new Scanner(System.in);
        String desiredFaculty = sc.nextLine();
        System.out.println("Список студентов факультета: ");
        for(int i = 0; i < student.length; i++) {
            if(student[i].getFaculty().toString().equals(desiredFaculty)) {
                System.out.println(student[i].toString());
            }
        }
        System.out.println();
    }

    public void printCommonStudentList(Student[] student) {

        for(Faculty f: Faculty.values()) {
            System.out.println(f.getDecoding() + ":");
            for(int i = 1; i <= 5; i++) {
                System.out.printf("студенты %d-го курса: \n", i);
                for(int j = 0; j < student.length; j++) {
                    if(student[j].getFaculty().toString().equals(f.toString()) && i == student[j].getCourse()) {
                        System.out.println(student[j].toString());
                    }
                }
            }
            System.out.println();
        }
    }

    public void printStudentListBornAfterGivenYear(Student[] student) {

        System.out.print("Введите интересующий вас год:");
        Scanner sc = new Scanner(System.in);
        int desiredYear = sc.nextInt();
        System.out.printf("Студенты, рожденный после %d года: \n", desiredYear);
        for(int i = 0; i < student.length; i++) {
            if(student[i].getBirthDate().isAfter(LocalDate.of(desiredYear, 12, 31)) ) {
                System.out.println(student[i].toString());
            }
        }
        System.out.println();
    }

    public void printStudentListInStudyGroup(Student[] student) {

        System.out.print("Введите название группы:");
        Scanner sc = new Scanner(System.in);
        String desiredGroup = sc.nextLine();
        System.out.printf("Студенты %s группы: \n", desiredGroup);
        for(int i = 0; i < student.length; i++) {
            if(student[i].getGroup().equals(desiredGroup) ) {
                System.out.println(student[i].toString());
            }
        }
        System.out.println();
    }
}
