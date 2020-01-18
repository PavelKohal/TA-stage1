package by.epamtc.automation.classes;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private LocalDate birthDate;
    private String address;
    private String phoneNumber;
    private Faculty faculty;
    private int course;
    private String group;

    public Student(String lastName, String firstName, Faculty faculty, int course, String group) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String lastName, String firstName, String patronymic, LocalDate birthDate,
                   String address, String phoneNumber, Faculty faculty, int course, String group) {

        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + faculty.getDecoding() +
                ", " + group + " группа, " + course + "-й курс";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                course == student.course &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(patronymic, student.patronymic) &&
                Objects.equals(birthDate, student.birthDate) &&
                Objects.equals(address, student.address) &&
                Objects.equals(phoneNumber, student.phoneNumber) &&
                faculty == student.faculty &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, patronymic, birthDate,
                address, phoneNumber, faculty, course, group);
    }
}
