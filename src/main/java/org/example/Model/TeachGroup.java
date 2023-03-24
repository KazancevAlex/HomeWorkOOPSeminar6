package org.example.Model;

import java.util.List;

// класс создающий учебную группу

public class TeachGroup<Teacher, Student> {
    int groupId;
    String teacher;
    List<Student> students;


    public TeachGroup() {
    }

    public TeachGroup(int groupId, String teacher, List<Student> students) {
        this.groupId = groupId;
        this.teacher = teacher;
        this.students = students;
    }


    @Override
    public String toString() {
        return "Учебная группа{" +
                "groupId=" + groupId +
                ", Учитель='" + teacher +
                ", Студенты=" + students + '\'' +
                '}';
    }
}
