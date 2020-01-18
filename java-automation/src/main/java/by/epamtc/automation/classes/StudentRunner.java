package by.epamtc.automation.classes;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentRunner {

    public static void main(String[] args) {

        Student[] student = new Student[12];

        student[0] = new Student(1151, "Романов", "Иван", "Ильич", LocalDate.of(1993, 2, 17),
                "Пушкина, 87-60", "+375-25-5056590", Faculty.EF, 3, "Э401");
        student[1] = new Student(1188, "Жуков", "Виктор", "Петрович", LocalDate.of(1991, 5, 12),
                "Дзержинского, 2-17", "+375-29-5197878", Faculty.EF, 3, "Э401");
        student[2] = new Student(1153, "Елисеев", "Максим", "Леонидович", LocalDate.of(1991, 1, 31),
                "Лынькова, 15-65", "+375-29-7011482", Faculty.EF, 3, "Э401");
        student[3] = new Student(1025, "Аврамова", "Инна", "Владимировна", LocalDate.of(1990, 5, 5),
                "Кульман, 9-79", "+375-44-1525252", Faculty.EF, 4, "Э301");

        student[4] = new Student(1152, "Артемьев", "Кирилл", "Павлович", LocalDate.of(1992, 3, 28),
                "Энгельса, 01-29", "+375-29-500258", Faculty.MF, 3, "М401");
        student[5] = new Student(1285, "Еремин", "Алексей", "Александрович", LocalDate.of(1992, 11, 4),
                "Пушкина, 85-14", "+375-29-5197878", Faculty.MF, 3, "М401");
        student[6] = new Student(1289, "Козик", "Арсений", "Констанович", LocalDate.of(1992, 8, 3),
                "Ленина, 35-178", "+375-33-7066900", Faculty.MF, 2, "М501");
        student[7] = new Student(1010, "Киреев", "Марк", "Петрович", LocalDate.of(1990, 6, 5),
                "Академика Купревича, 2-11", "+375-25-5010114", Faculty.MF, 4, "М301");

        student[8] = new Student(1616, "Морозова", "Алла", "Ивановна", LocalDate.of(1993, 2, 15),
                "Лынькова, 32-4", "+375-25-7099633", Faculty.TF, 1, "Т601");
        student[9] = new Student(1617, "Белова", "Полина", "Григорьевна", LocalDate.of(1993, 12, 15),
                "Берута, 2-58", "+375-33-8756325", Faculty.TF, 1, "Т401");
        student[10] = new Student(1080, "Есенина", "Юлия", "Александровна", LocalDate.of(1990, 2, 9),
                "Дзержинского, 2-17", "+375-29-5197878", Faculty.TF, 4, "Т304");
        student[11] = new Student(1085, "Рылькова", "Алина", "Владимировна", LocalDate.of(1991, 1, 22),
                "Пушкина, 55-128", "+375-44-3835529", Faculty.TF, 4, "Т304");


        while (true) {

            System.out.println("1. Вывести список студентов заданного факультета.");
            System.out.println("2. Вывести списки студентов для каждого факультета и курса.");
            System.out.println("3. Вывести список студентов, родившихся после заданного года.");
            System.out.println("4. Вывести список учебной группы.");
            System.out.println("0. Завершить программу.");
            System.out.print("\nВведите номер требуемого действия: ");

            Scanner sc = new Scanner(System.in);
            int userChoice = sc.nextInt();

            StudentLogic sl = new StudentLogic();

            switch (userChoice) {
                case 1:
                    sl.printStudentListGivenFaculty(student);
                    break;
                case 2:
                    sl.printCommonStudentList(student);
                    break;
                case 3:
                    sl.printStudentListBornAfterGivenYear(student);
                    break;
                case 4:
                    sl.printStudentListInStudyGroup(student);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Повторите ввод");
                    break;
            }
        }
    }
}
