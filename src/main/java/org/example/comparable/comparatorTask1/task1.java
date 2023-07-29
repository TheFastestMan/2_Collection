package org.example.comparable.comparatorTask1;

import org.example.comparable.comparatorTask1.Student;

import java.util.*;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("Igor", 1, 2));
        studentsList.add(new Student("Luba", 2, 2));
        studentsList.add(new Student("Ivan", 3, 3));
        studentsList.add(new Student("Boris", 3, 4));
        studentsList.add(new Student("Luda", 4, 5));
        studentsList.add(new Student("Ura", 5, 5));
        studentsList.add(new Student("Alfred", 3, 5));
        studentsList.add(new Student("Arnold", 5, 4));
        studentsList.add(new Student("Robert", 2, 3));

        showStudents(sortedByName(studentsList));
        System.out.println("----------------------------------------------");
        showStudents(sortedByGroup(studentsList));
        System.out.println("-----------------------------------------------");
        showStudents(sortedByAverageGrade(studentsList));
        System.out.println("-----------------------------------------------");
        showStudents(sortedByAverageGradeInGroup(studentsList));
        System.out.println("-----------------------------------------------");
        deleteStudent(studentsList);


    }

    public static void deleteStudent(List<Student> students) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            if (iter.next().getAverageGrade() < 3) {
                iter.remove();
            }
        }
        System.out.println(students);
    }

    public static List<Student> sortedByName(List<Student> students) {
        List<Student> sortedStudent = new ArrayList<>(students);
        Collections.sort(sortedStudent, Comparator.comparing(Student::getName));
        return sortedStudent;
    }

    public static List<Student> sortedByGroup(List<Student> students) {
        List<Student> sortedStudent = new ArrayList<>(students);
        sortedStudent.sort(Comparator.comparing(Student::getGroup));
        return sortedStudent;
    }

    public static List<Student> sortedByAverageGrade(List<Student> students) {
        List<Student> sortedStudent = new ArrayList<>(students);
        sortedStudent.sort(Comparator.comparing(Student::getAverageGrade));
        return sortedStudent;
    }

    public static List<Student> sortedByAverageGradeInGroup(List<Student> students) {
        List<Student> sortedStudent = new ArrayList<>(students);
        sortedStudent.sort(Comparator.comparing(Student::getGroup).thenComparing(Student::getAverageGrade));
        return sortedStudent;
    }

    public static void showStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + " || " + "Group: " + student.getGroup() + " || "
                    + "Average grade: " + " " + student.getAverageGrade());
        }
    }

}
