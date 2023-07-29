package org.example.comparable.comparatorTask1;

import java.util.Comparator;

public class Student  {
    private String name;
    private int group;
    private int averageGrade;

    public Student(String name, int group, int averageGrade) {
        this.name = name;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", averageGrade=" + averageGrade +
                '}';
    }

}
